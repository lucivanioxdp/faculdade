package com.unip.app.view.panels;

import com.unip.app.dao.DaoException;
import com.unip.app.model.GerenciadorVertice;
import com.unip.app.model.Matriz;
import com.unip.app.model.Vertice;
import com.unip.app.view.configurator.ComponentsConfigurator;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MatrizFormPanel extends JPanel{
    private JButton btnSelecionar, btnCancelar, btnInserir;
    private JTextField txtId,txtNome, txtValor;
    private Vertice vertice;
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private GerenciadorVertice gerenciador = GerenciadorVertice.getInstance();

    public MatrizFormPanel(){
        initialize();
    }
    
    private void initialize(){
        montaPainel();
        this.setVisible(true);
    }
    private JPanel montaPainel(){
        this.setLayout(new GridLayout(10,1));
        btnInserir = new JButton("Inserir");
            btnInserir.setMnemonic(KeyEvent.VK_D);
            btnInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try {
                    //para não ser criado vertices com arestas vazias
                    if(getVerticeEditado().getAresta() != null){
                        gerenciador.salvar(getVerticeEditado());
                    }
                    MatrizPanel.getInstance().atualizaTabela();
                } catch (DaoException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO ao inserir adjacência, tente novamente");
                }
                    

            }
        });
        txtId = new JTextField();
            txtId.setEditable(false);
        txtNome = new JTextField();
            txtNome.setEditable(false);
        txtValor = new JTextField();
        btnCancelar = new JButton("Cancelar");
        btnSelecionar = new JButton("Selecionar");
            btnSelecionar.setMnemonic(KeyEvent.VK_S);
            btnSelecionar.addActionListener(new BuscarListener());
        
        this.add(new JLabel("ID"));
        this.add(txtId);
        this.add(new JLabel("Vertice em Edição"));
        this.add(txtNome);
        this.add(new JLabel("Peso Adjacência"));
        this.add(txtValor);
        this.add(btnSelecionar);
        this.add(btnInserir);
        this.add(btnCancelar);
        this.setVisible(true);
        return this;
    }
    
    //exibe o vertice selecionado no JTextField
    void setVertice(Vertice vertice){
        if (vertice != null){
            this.vertice = vertice;
            int coluna = MatrizPanel.getInstance().getColunaSelecionada();
            int valorVertice = vertice.getAresta(coluna);
            txtId.setText(Integer.toString(vertice.getId()));
            txtNome.setText(vertice.getNomeVertice());
            txtValor.setText(Integer.toString(valorVertice));
        }else {
            JOptionPane.showConfirmDialog(this, "Vertice nulo", "Erro",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //da tela para o objeto
    Vertice getVerticeEditado(){
        Vertice verticeEditado = new Vertice();
        try{
            verticeEditado.setId(Integer.parseInt(txtId.getText()));
            verticeEditado.setNomeVertice(txtNome.getText());
            verticeEditado.setAresta(alteraAresta());
        }
        catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Não é possivel inserir um valor de vertice nulo, selecione um vertice");
            }
        return verticeEditado;
    }
    
    int[] alteraAresta(){
        
        //tenho que fazer retornar o vertice com a aresta modificada;
        Vertice verticeSelecionado = MatrizPanel.getInstance().getVerticeSelecionada();
        int arestas[] = new int[Matriz.getInstance().getTamanhoMatriz()];
        try{
        int colunaSelecionada = MatrizPanel.getInstance().getColunaSelecionada();
        //funciona
        for(int i =0; i<verticeSelecionado.getAresta().length;i++){
            arestas[i] = verticeSelecionado.getAresta(i);
        }
        arestas[colunaSelecionada]=Integer.parseInt(txtValor.getText());
        //------
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Não é possivel inserir um valor de vertice nulo, selecione um vertice");
        }return arestas;
    }
    
    private class BuscarListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            Vertice verticeSelecionado = MatrizPanel.getInstance().getVerticeSelecionada();
            setVertice(verticeSelecionado);
        }     
    }
    
    
    
}