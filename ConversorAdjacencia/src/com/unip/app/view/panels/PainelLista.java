package com.unip.app.view.panels;

import com.unip.app.model.Adjacencia;
import com.unip.app.model.Lista;
import com.unip.app.view.windows.ListaWindow;
import com.unip.app.view.windows.MatrizWindow;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PainelLista extends JPanel{
    private VerticeLista v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;
    private JPanel blocoV1, blocoV2, blocoV3, blocoV4, blocoV5, blocoV6, blocoV7,
                                                       blocoV8,blocoV9,blocoV10;
    
    public List<Adjacencia>adV1, adV2, adV3, adV4, adV5, adV6, adV7, adV8, adV9, adV10;
    private List <VerticeLista> listasAgrupadas;
    private JButton btnConfirmar;
    private static PainelLista instance;
    
    private PainelLista(){
        initialize();
    }
    
    public static PainelLista getInstance(){
        if (instance == null){
            instance = new PainelLista();
        }return instance;
    }
    
    public static void clear(){
        instance = null;
    }
    
    private void initialize(){
        this.setLayout(new GridLayout(10,1, 10, 0));
        montaListas();
        this.setVisible(true);
    }
    
    private void agrupaListas(){
        listasAgrupadas = new ArrayList<>();
        v1 = new VerticeLista("V1");
        v2 = new VerticeLista("V2");
        v3 = new VerticeLista("V3");
        v4 = new VerticeLista("V4");
        v5 = new VerticeLista("V5");
        v6 = new VerticeLista("V6");
        v7 = new VerticeLista("V7");
        v8 = new VerticeLista("V8");
        v9 = new VerticeLista("V9");
        v10 = new VerticeLista("V10");
        
        listasAgrupadas.add(0,v1);
        listasAgrupadas.add(1,v2);
        listasAgrupadas.add(2,v3);
        listasAgrupadas.add(3,v4);
        listasAgrupadas.add(4,v5);
        listasAgrupadas.add(5,v6);
        listasAgrupadas.add(6,v7);
        listasAgrupadas.add(7,v8);
        listasAgrupadas.add(8,v9);
        listasAgrupadas.add(9,v10);
        
    }
    
    private void montaListas(){
        int tamanho = Lista.getInstance().getTamanhoLista();
        agrupaListas();
        for(int i=0; i<tamanho; i++){
            this.add(listasAgrupadas.get(i));
        }
        
    }
    
    private void organizaLista(){
        adV1 = listasAgrupadas.get(0).getAdjacentes();
        adV2 = listasAgrupadas.get(1).getAdjacentes();
        adV3 = listasAgrupadas.get(2).getAdjacentes();
        adV4 = listasAgrupadas.get(3).getAdjacentes();
        adV5 = listasAgrupadas.get(4).getAdjacentes();
        adV6 = listasAgrupadas.get(5).getAdjacentes();
        adV7 = listasAgrupadas.get(6).getAdjacentes();
        adV8 = listasAgrupadas.get(7).getAdjacentes();
        adV9 = listasAgrupadas.get(8).getAdjacentes();
        adV10 = listasAgrupadas.get(9).getAdjacentes();
        
        montaPnlBlocos();
        
        //contrói bloco v1
        for (int i =0; i<listasAgrupadas.get(0).getAdjacentes().size(); i++){
            if(i==0){
                blocoV1.removeAll(); blocoV1.repaint();
            }
            blocoV1.add(new JButton(adV1.get(i).getNome()+" | "+adV1.get(i).getPeso()));
            blocoV1.add(new JLabel("-->"));
        }
        for (int i =0; i<listasAgrupadas.get(1).getAdjacentes().size(); i++){
            if(i == 0){
                blocoV2.removeAll(); blocoV2.repaint();
            }
            blocoV2.add(new JButton(adV2.get(i).getNome()+" | "+adV2.get(i).getPeso()));
            blocoV2.add(new JLabel("-->"));
        }
        for (int i =0; i<listasAgrupadas.get(2).getAdjacentes().size(); i++){
            if(i==0){
                blocoV3.removeAll(); blocoV3.repaint();
            }
            blocoV3.add(new JButton(adV3.get(i).getNome()+" | "+adV3.get(i).getPeso()));
            blocoV3.add(new JLabel("-->"));
        }
        
        for (int i =0; i<listasAgrupadas.get(3).getAdjacentes().size(); i++){
            if(i == 0){
                blocoV4.removeAll(); blocoV4.repaint();
            }
            blocoV4.add(new JButton(adV4.get(i).getNome()+" | "+adV4.get(i).getPeso()));
            blocoV4.add(new JLabel("-->"));
        }
        
        for (int i =0; i<listasAgrupadas.get(4).getAdjacentes().size(); i++){
            if(i == 0){
                blocoV5.removeAll(); blocoV5.repaint();
            }
            blocoV5.add(new JButton(adV5.get(i).getNome()+" | "+adV5.get(i).getPeso()));
            blocoV5.add(new JLabel("-->"));
        }
        
        for (int i =0; i<listasAgrupadas.get(5).getAdjacentes().size(); i++){
            if(i==0){
                blocoV5.removeAll(); blocoV6.repaint();
            }
            blocoV6.add(new JButton(adV6.get(i).getNome()+" | "+adV6.get(i).getPeso()));
            blocoV6.add(new JLabel("-->"));
        }
        
        for (int i =0; i<listasAgrupadas.get(6).getAdjacentes().size(); i++){
            if(i == 0){
                blocoV7.removeAll(); blocoV7.repaint();
            }
            blocoV7.add(new JButton(adV7.get(i).getNome()+" | "+adV7.get(i).getPeso()));
            blocoV7.add(new JLabel("-->"));
        }
        
        for (int i =0; i<listasAgrupadas.get(7).getAdjacentes().size(); i++){
            if(i==0){
                blocoV8.removeAll(); blocoV8.repaint();
            }
            blocoV8.add(new JButton(adV8.get(i).getNome()+" | "+adV8.get(i).getPeso()));
            blocoV8.add(new JLabel("-->"));
        }
        
        for (int i =0; i<listasAgrupadas.get(8).getAdjacentes().size(); i++){
            if(i == 0){
                blocoV9.removeAll(); blocoV9.repaint();
            }
            blocoV9.add(new JButton(adV9.get(i).getNome()+" | "+adV9.get(i).getPeso()));
            blocoV9.add(new JLabel("-->"));
        }
        
        for (int i =0; i<listasAgrupadas.get(9).getAdjacentes().size(); i++){
            if(i == 0){
                blocoV10.removeAll(); blocoV10.repaint();
            }
            blocoV10.add(new JButton(adV10.get(i).getNome()+" | "+adV10.get(i).getPeso()));
            blocoV10.add(new JLabel("-->"));
        }
        
    }
    //parei aqui
    public JPanel desenhaListas(){
        organizaLista();
        JPanel listas = new JPanel(new GridLayout(10,1));
        List<JPanel>blocos = new ArrayList<>();
        blocos.add(blocoV1);
        blocos.add(blocoV2);
        blocos.add(blocoV3);
        blocos.add(blocoV4);
        blocos.add(blocoV5);
        blocos.add(blocoV6);
        blocos.add(blocoV7);
        blocos.add(blocoV8);
        blocos.add(blocoV9);
        blocos.add(blocoV10);
        
        for(int i=0; i<Lista.getInstance().getTamanhoLista(); i++){
            listas.add(blocos.get(i));
        }
        JPanel painelListas = new JPanel (new BorderLayout());
        painelListas.add(criaPnlNomes(), BorderLayout.WEST);
        painelListas.add(listas, BorderLayout.CENTER);
        return painelListas;
    }
     
    private void montaPnlBlocos(){
        blocoV1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            blocoV1.add(new JButton("null"));
        blocoV2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            blocoV2.add(new JButton("null"));
        blocoV3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            blocoV3.add(new JButton("null"));
        blocoV4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            blocoV4.add(new JButton("null"));
        blocoV5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            blocoV5.add(new JButton("null"));
        blocoV6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            blocoV6.add(new JButton("null"));
        blocoV7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            blocoV7.add(new JButton("null"));
        blocoV8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            blocoV8.add(new JButton("null"));
        blocoV9 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            blocoV9.add(new JButton("null"));
        blocoV10 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            blocoV10.add(new JButton("null"));
        
    }
    
    private JPanel criaPnlNomes(){
        JPanel nomes = new JPanel(new GridLayout(10,1));
        for(int i=1; i<Lista.getInstance().getTamanhoLista()+1; i++){
            nomes.add(new JLabel("V"+i+": "));
        }return nomes;
    }
}
