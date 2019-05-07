package com.unip.app.view.panels;

import com.unip.app.model.ConversorParaMatriz;
import com.unip.app.model.Lista;
import com.unip.app.model.Vertice;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class PainelMatrizConvertida extends JPanel{
    JTable tblMatriz;
    JScrollPane scroll;
    JPanel pnlResult;
    private static PainelMatrizConvertida instance;
    
    private PainelMatrizConvertida(){
        initialize();
    }
    
    public static PainelMatrizConvertida getInstance(){
        if(instance == null){
            instance = new PainelMatrizConvertida();
        }return instance;
    }
    
    private void initialize(){
        this.setLayout(new BorderLayout());
        JScrollPane painelTabela = montaPainel();
        this.add(painelTabela, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    private JScrollPane montaPainel(){
        MatrizTableModel model = null;
        List<Vertice>vertices = new ArrayList();
        for(int i=0; i<Lista.getInstance().getTamanhoLista(); i++){
            vertices.add(ConversorParaMatriz.getInstance().converter().get(i));
        }
        try{
            model = new MatrizTableModel(vertices);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Erro na Conversão");
        }
        tblMatriz = new JTable(model);
        tblMatriz.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scroll = new JScrollPane(tblMatriz);
        return scroll;
    }
    
}
