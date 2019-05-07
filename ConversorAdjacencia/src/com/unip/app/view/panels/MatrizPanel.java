package com.unip.app.view.panels;

import com.unip.app.dao.DaoException;
import com.unip.app.model.GerenciadorVertice;
import com.unip.app.model.Matriz;
import com.unip.app.model.Vertice;
import com.unip.app.view.configurator.ComponentsConfigurator;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class MatrizPanel extends JPanel{
    private JTable tblMatriz;
    private JButton btnConfirmar;
    private MatrizTableModel model;
    private JScrollPane scroll;
    private ComponentsConfigurator configurator = new ComponentsConfigurator();
    private final String source = "/com/unip/app/view/images/";
    private GerenciadorVertice gerenciador = GerenciadorVertice.getInstance();
    private static MatrizPanel instance;
        
    private MatrizPanel(){
        initialize();
    }
    
    public static MatrizPanel getInstance(){
        if (instance == null){
            instance = new MatrizPanel();
        }return instance;
    }
    
    //metodo para limpar o singleton e reiniciar a instancia
    public static void clear(){
        instance = null;
    }
    private void initialize(){
        this.setLayout(new BorderLayout());
        JScrollPane painelTabela = createTable();
        this.add(painelTabela, BorderLayout.CENTER);
        JPanel nomes = new JPanel();
        nomes.add(criaPnlNomes());
        this.add(nomes, BorderLayout.WEST);
        this.setVisible(true);        
    }
    
   
    public JScrollPane createTable(){
        model = null;
        try{
            model = new MatrizTableModel(gerenciador.getTodos());
        }catch (DaoException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Criar Matriz de Adjacência");
        }
        tblMatriz = new JTable(model);
        tblMatriz.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scroll = new JScrollPane(tblMatriz);
        return scroll;
    }
    
    
    
    //pega o objeto da linha que está selecionada
    public Vertice getVerticeSelecionada(){
        int linhaSelecionada = tblMatriz.getSelectedRow();
        Vertice verticeSelecionado = null;
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(null, "Nenhuma Linha Selecionada");
        }else{
            //retorna o model utilizado na tabela matriz
            MatrizTableModel matrizTableModel = (MatrizTableModel)tblMatriz.getModel();
            //chama o metodo da TableModel que retorna o item da lista
            verticeSelecionado = matrizTableModel.getVertice(linhaSelecionada);
        }return verticeSelecionado;
    }
    
    public void atualizaTabela(){
        tblMatriz.revalidate();
        tblMatriz.repaint();
    }
    
    public int getColunaSelecionada(){
        return tblMatriz.getSelectedColumn();
    }
    
    public int getLinhaSelecionada(){
        return tblMatriz.getSelectedRow();
    }
    
    public Vertice getVertice(int linha){
       Vertice vertice = model.getVertice(linha);
       return vertice;
    }
    
    private JPanel criaPnlNomes(){
        JPanel nomes = new JPanel(new GridLayout(21,1,2,3));
        for(int i=0; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
            if(i == 0){
                nomes.add(new JLabel(""));
            }else{
            nomes.add(new JLabel("V"+i+": "));
            }
        }return nomes;
    }
}
