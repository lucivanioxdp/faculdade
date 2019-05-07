package com.unip.app.model;

import com.unip.app.dao.DaoException;
import com.unip.app.view.panels.MatrizPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ConversorParaLista {
    private static ConversorParaLista instance;
    private List <Vertice> vertices;
    private List <Adjacencia> adV1, adV2, adV3, adV4, adV5, adV6, adV7, adV8, adV9, adV10;
    private JPanel blocoV1, blocoV2, blocoV3, blocoV4, blocoV5, blocoV6, blocoV7,
                                                       blocoV8,blocoV9,blocoV10;
    
    private ConversorParaLista(){
        
    }
    
    public static ConversorParaLista getInstance(){
        if (instance == null){
            instance = new ConversorParaLista();
        }return instance;
    }
    
    private void initialize(){
        
    }
    
    public void converter()throws DaoException{
        adV1 = new ArrayList();
            if(Matriz.getInstance().getTamanhoMatriz() >= 1){
            Vertice v1 = MatrizPanel.getInstance().getVertice(0);
            for (int i = 1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
                if(v1.getAresta(i-1)>0){
                    adV1.add(new Adjacencia("V"+i, v1.getAresta(i-1)));
                }
            }
        }
        
        adV2 = new ArrayList();
        if(Matriz.getInstance().getTamanhoMatriz() >= 2){
            Vertice v2 = MatrizPanel.getInstance().getVertice(1);
            for (int i = 1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
                if(v2.getAresta(i-1)>0){
                    adV2.add(new Adjacencia("V"+i, v2.getAresta(i-1)));
                }
            }
        }
        
        adV3 = new ArrayList();
        if(Matriz.getInstance().getTamanhoMatriz() >= 3){
            Vertice v3 = MatrizPanel.getInstance().getVertice(2);
            for (int i = 1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
                if(v3.getAresta(i-1)>0){
                    adV3.add(new Adjacencia("V"+i, v3.getAresta(i-1)));
                }
            }
        }
        
        adV4 = new ArrayList();
        if(Matriz.getInstance().getTamanhoMatriz() >= 4){
            Vertice v4 = MatrizPanel.getInstance().getVertice(3);
            for (int i = 1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
                if(v4.getAresta(i-1)>0){
                    adV4.add(new Adjacencia("V"+i, v4.getAresta(i-1)));
                }
            }
        }
        
        adV5 = new ArrayList();
        if(Matriz.getInstance().getTamanhoMatriz() >= 5){
            Vertice v5 = MatrizPanel.getInstance().getVertice(4);
            for (int i = 1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
                if(v5.getAresta(i-1)>0){
                    adV5.add(new Adjacencia("V"+i, v5.getAresta(i-1)));
                }
            }
        }
        
        adV6 = new ArrayList();
            if(Matriz.getInstance().getTamanhoMatriz() >= 6){
            Vertice v6 = MatrizPanel.getInstance().getVertice(5);
            for (int i = 1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
                if(v6.getAresta(i-1)>0){
                    adV6.add(new Adjacencia("V"+i, v6.getAresta(i-1)));
                }
            }
        }
        
        adV7 = new ArrayList();
        if(Matriz.getInstance().getTamanhoMatriz() >= 7){
            Vertice v7 = MatrizPanel.getInstance().getVertice(6);
            for (int i = 1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
                if(v7.getAresta(i-1)>0){
                    adV7.add(new Adjacencia("V"+i, v7.getAresta(i-1)));
                }
            }
        }
        
        adV8 = new ArrayList();
        if(Matriz.getInstance().getTamanhoMatriz() >= 8){
            Vertice v8 = MatrizPanel.getInstance().getVertice(7);
            for (int i = 1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
                if(v8.getAresta(i-1)>0){
                    adV8.add(new Adjacencia("V"+i, v8.getAresta(i-1)));
                }
            }
        }
        
        adV9 = new ArrayList();
            if(Matriz.getInstance().getTamanhoMatriz() >= 9){
            Vertice v9 = MatrizPanel.getInstance().getVertice(8);
            for (int i = 1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
                if(v9.getAresta(i-1)>0){
                    adV9.add(new Adjacencia("V"+i, v9.getAresta(i-1)));
                }
            }
        }
            
        adV10 = new ArrayList();
        if(Matriz.getInstance().getTamanhoMatriz() >= 10){
            Vertice v10 = MatrizPanel.getInstance().getVertice(9);
            for (int i = 1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
                if(v10.getAresta(i-1)>0){
                    adV10.add(new Adjacencia("V"+i, v10.getAresta(i-1)));
                }
            }
        }
    }
    
    private void organizaLista(){
        try {
                converter();
            } catch (DaoException ex) {
            Logger.getLogger(ConversorParaLista.class.getName()).log(Level.SEVERE, null, ex);
        }
        montaPnlBlocos();
        
        //contrói bloco v1
        for (int i =0; i<adV1.size(); i++){
            if(i==0){
                blocoV1.removeAll(); blocoV1.repaint();
            }
            blocoV1.add(new JButton(adV1.get(i).getNome()+" | "+adV1.get(i).getPeso()));
            blocoV1.add(new JLabel("-->"));
        }
        for (int i =0; i<adV2.size(); i++){
            if(i == 0){
                blocoV2.removeAll(); blocoV2.repaint();
            }
            blocoV2.add(new JButton(adV2.get(i).getNome()+" | "+adV2.get(i).getPeso()));
            blocoV2.add(new JLabel("-->"));
        }
        for (int i =0; i<adV3.size(); i++){
            if(i==0){
                blocoV3.removeAll(); blocoV3.repaint();
            }
            blocoV3.add(new JButton(adV3.get(i).getNome()+" | "+adV3.get(i).getPeso()));
            blocoV3.add(new JLabel("-->"));
        }
        
        for (int i =0; i<adV4.size(); i++){
            if(i == 0){
                blocoV4.removeAll(); blocoV4.repaint();
            }
            blocoV4.add(new JButton(adV4.get(i).getNome()+" | "+adV4.get(i).getPeso()));
            blocoV4.add(new JLabel("-->"));
        }
        
        for (int i =0; i<adV5.size(); i++){
            if(i == 0){
                blocoV5.removeAll(); blocoV5.repaint();
            }
            blocoV5.add(new JButton(adV5.get(i).getNome()+" | "+adV5.get(i).getPeso()));
            blocoV5.add(new JLabel("-->"));
        }
        
        for (int i =0; i<adV6.size(); i++){
            if(i==0){
                blocoV5.removeAll(); blocoV6.repaint();
            }
            blocoV6.add(new JButton(adV6.get(i).getNome()+" | "+adV6.get(i).getPeso()));
            blocoV6.add(new JLabel("-->"));
        }
        
        for (int i =0; i<adV7.size(); i++){
            if(i == 0){
                blocoV7.removeAll(); blocoV7.repaint();
            }
            blocoV7.add(new JButton(adV7.get(i).getNome()+" | "+adV7.get(i).getPeso()));
            blocoV7.add(new JLabel("-->"));
        }
        
        for (int i =0; i<adV8.size(); i++){
            if(i==0){
                blocoV8.removeAll(); blocoV8.repaint();
            }
            blocoV8.add(new JButton(adV8.get(i).getNome()+" | "+adV8.get(i).getPeso()));
            blocoV8.add(new JLabel("-->"));
        }
        
        for (int i =0; i<adV9.size(); i++){
            if(i == 0){
                blocoV9.removeAll(); blocoV9.repaint();
            }
            blocoV9.add(new JButton(adV9.get(i).getNome()+" | "+adV9.get(i).getPeso()));
            blocoV9.add(new JLabel("-->"));
        }
        
        for (int i =0; i<adV10.size(); i++){
            if(i == 0){
                blocoV10.removeAll(); blocoV10.repaint();
            }
            blocoV10.add(new JButton(adV10.get(i).getNome()+" | "+adV10.get(i).getPeso()));
            blocoV10.add(new JLabel("-->"));
        }
        
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
        
        for(int i=0; i<Matriz.getInstance().getTamanhoMatriz(); i++){
            listas.add(blocos.get(i));
        }
        JPanel painelListas = new JPanel (new BorderLayout());
        painelListas.add(criaPnlNomes(), BorderLayout.WEST);
        painelListas.add(listas, BorderLayout.CENTER);
        return painelListas;
    }
    
    private JPanel criaPnlNomes(){
        JPanel nomes = new JPanel(new GridLayout(10,1));
        for(int i=1; i<Matriz.getInstance().getTamanhoMatriz()+1; i++){
            nomes.add(new JLabel("V"+i+": "));
        }return nomes;
    }
}
