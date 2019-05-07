package com.unip.app.view.panels;


import com.unip.app.dao.DaoException;
import com.unip.app.model.ConversorParaLista;
import com.unip.app.model.Lista;
import com.unip.app.model.Matriz;
import com.unip.app.model.TipoAdjacencia;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PainelResultConversao extends JPanel{
    private JComboBox cbxOpcao;
    private JButton btnConverter;
    private JPanel pnlResult;
    private static PainelResultConversao instance;
    
    private PainelResultConversao(){
        initialize();
    }
    
    public static PainelResultConversao getInstance(){
        if (instance == null){
            instance = new PainelResultConversao();
        }return instance;
    }
    
    private void initialize(){
        this.setLayout(new BorderLayout());
        this.add(montaPainelEscolha(), BorderLayout.NORTH);
        this.add(montaPnlResult(), BorderLayout.CENTER);
        Border border = BorderFactory.createTitledBorder("Painel de Conversão");
        this.setBorder(border);
        this.setVisible(true);
    }
    
    private JPanel montaPainelEscolha(){
        JPanel painelEscolha = new JPanel(new FlowLayout(FlowLayout.CENTER));
            List<String>opcoes = new ArrayList<>();
            cbxOpcao = new JComboBox(TipoAdjacencia.values());
            btnConverter = new JButton("Converter");
                btnConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                addMatrizConvertida();
                addListaConvertida();
                
            }
        });
            painelEscolha.add(cbxOpcao);
            painelEscolha.add(btnConverter);
            return painelEscolha;
    }
    
    public JPanel montaPnlResult(){
        pnlResult = new JPanel(new FlowLayout());
        return pnlResult;
    }
    
    public void addMatrizConvertida(){
        if(cbxOpcao.getSelectedIndex() == 0){
            if(Lista.getInstance().getTamanhoLista()>0){
                pnlResult.removeAll();
                Matriz.clear();
                pnlResult.add(criaPnlNomes());
                pnlResult.add(PainelMatrizConvertida.getInstance());
                this.revalidate();
                this.repaint();
            }else{
                JOptionPane.showMessageDialog(null, "É necessário criar o item a ser convertido");
            }
        }
    }
    
    public void addListaConvertida(){
        if(cbxOpcao.getSelectedIndex() == 1){
            if(Matriz.getInstance().getTamanhoMatriz()>0){
                pnlResult.removeAll();
                Lista.clear();
                pnlResult.add(ConversorParaLista.getInstance().desenhaListas());
                this.revalidate();
                this.repaint();
            }else{
                JOptionPane.showMessageDialog(null, "É necessário criar o item a ser convertido");
            }
        }
    }
    
    private JPanel criaPnlNomes(){
        JPanel nomes = new JPanel(new GridLayout(21,1,2,2));
        for(int i=0; i<Lista.getInstance().getTamanhoLista()+1; i++){
            if(i == 0){
                nomes.add(new JLabel(""));
            }else{
            nomes.add(new JLabel("V"+i+": "));
            }
        }return nomes;
    }
}
