package com.unip.app.model;

import com.unip.app.dao.DaoException;
import com.unip.app.view.panels.MatrizTableModel;
import com.unip.app.view.panels.PainelLista;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;


public class ConversorParaMatriz {
    private static ConversorParaMatriz instance;
    private JTable tblMatriz;
    
    private ConversorParaMatriz(){
        
    }
    
    public static ConversorParaMatriz getInstance(){
        if (instance == null){
            instance = new ConversorParaMatriz();
        }return instance;
    }
    
    private void initialize(){
        
    }
    
    public List<Vertice> converter(){
        
        //converter primeiro vertice
        int arestasV1[] = new int[Lista.getInstance().getTamanhoLista()+1];
        for(int i=0; i< PainelLista.getInstance().adV1.size(); i++){
            String nome = PainelLista.getInstance().adV1.get(i).getNome();
            int indice = Integer.parseInt(nome.substring(1));
            int indiceAdjacencia = PainelLista.getInstance().adV1.indexOf
                                        (PainelLista.getInstance().adV1.get(i));
            
           arestasV1[indice-1] = PainelLista.getInstance().adV1.get(indiceAdjacencia).getPeso(); 
        }
        Vertice v1 = new Vertice(1, "V1", arestasV1);
        
        //converter 2 vertice
        int arestasV2[] = new int[Lista.getInstance().getTamanhoLista()+1];
        for(int i=0; i< PainelLista.getInstance().adV2.size(); i++){
            String nome = PainelLista.getInstance().adV2.get(i).getNome();
            int indice = Integer.parseInt(nome.substring(1));
            int indiceAdjacencia = PainelLista.getInstance().adV2.indexOf
                                        (PainelLista.getInstance().adV2.get(i));  
           arestasV2[indice-1] = PainelLista.getInstance().adV2.get(indiceAdjacencia).getPeso(); 
        }
        Vertice v2 = new Vertice(2, "V2", arestasV2);
        
        //converter 3 vertice
        int arestasV3[] = new int[Lista.getInstance().getTamanhoLista()+1];
        for(int i=0; i< PainelLista.getInstance().adV3.size(); i++){
            String nome = PainelLista.getInstance().adV3.get(i).getNome();
            int indice = Integer.parseInt(nome.substring(1));
            int indiceAdjacencia = PainelLista.getInstance().adV3.indexOf
                                        (PainelLista.getInstance().adV3.get(i));  
           arestasV3[indice-1] = PainelLista.getInstance().adV3.get(indiceAdjacencia).getPeso(); 
        }
        Vertice v3 = new Vertice(3, "V3", arestasV3);
        
        //converte 4 vertice
        int arestasV4[] = new int[Lista.getInstance().getTamanhoLista()+1];
        for(int i=0; i< PainelLista.getInstance().adV4.size(); i++){
            String nome = PainelLista.getInstance().adV4.get(i).getNome();
            int indice = Integer.parseInt(nome.substring(1));
            int indiceAdjacencia = PainelLista.getInstance().adV4.indexOf
                                        (PainelLista.getInstance().adV4.get(i));  
           arestasV4[indice-1] = PainelLista.getInstance().adV4.get(indiceAdjacencia).getPeso(); 
        }
        Vertice v4 = new Vertice(4, "V4", arestasV4);
        
        //converte 5 vertice
        int arestasV5[] = new int[Lista.getInstance().getTamanhoLista()+1];
        for(int i=0; i< PainelLista.getInstance().adV5.size(); i++){
            String nome = PainelLista.getInstance().adV5.get(i).getNome();
            int indice = Integer.parseInt(nome.substring(1));
            int indiceAdjacencia = PainelLista.getInstance().adV5.indexOf
                                        (PainelLista.getInstance().adV5.get(i));  
           arestasV5[indice-1] = PainelLista.getInstance().adV5.get(indiceAdjacencia).getPeso(); 
        }
        Vertice v5 = new Vertice(5, "V5", arestasV5);
        
        //converte 6 vertice
        int arestasV6[] = new int[Lista.getInstance().getTamanhoLista()+1];
        for(int i=0; i< PainelLista.getInstance().adV6.size(); i++){
            String nome = PainelLista.getInstance().adV6.get(i).getNome();
            int indice = Integer.parseInt(nome.substring(1));
            int indiceAdjacencia = PainelLista.getInstance().adV6.indexOf
                                        (PainelLista.getInstance().adV6.get(i));  
           arestasV6[indice-1] = PainelLista.getInstance().adV6.get(indiceAdjacencia).getPeso(); 
        }
        Vertice v6 = new Vertice(6, "V6", arestasV6);
        
        //converte 7 vertice
        int arestasV7[] = new int[Lista.getInstance().getTamanhoLista()+1];
        for(int i=0; i< PainelLista.getInstance().adV7.size(); i++){
            String nome = PainelLista.getInstance().adV7.get(i).getNome();
            int indice = Integer.parseInt(nome.substring(1));
            int indiceAdjacencia = PainelLista.getInstance().adV7.indexOf
                                        (PainelLista.getInstance().adV7.get(i));  
           arestasV7[indice-1] = PainelLista.getInstance().adV7.get(indiceAdjacencia).getPeso(); 
        }
        Vertice v7 = new Vertice(7, "V7", arestasV7);
        
        //converte 8 vertice
        int arestasV8[] = new int[Lista.getInstance().getTamanhoLista()+1];
        for(int i=0; i< PainelLista.getInstance().adV8.size(); i++){
            String nome = PainelLista.getInstance().adV8.get(i).getNome();
            int indice = Integer.parseInt(nome.substring(1));
            int indiceAdjacencia = PainelLista.getInstance().adV8.indexOf
                                        (PainelLista.getInstance().adV8.get(i));  
           arestasV8[indice-1] = PainelLista.getInstance().adV8.get(indiceAdjacencia).getPeso(); 
        }
        Vertice v8 = new Vertice(8, "V8", arestasV4);
        
        //converte 9 vertice
        int arestasV9[] = new int[Lista.getInstance().getTamanhoLista()+1];
        for(int i=0; i< PainelLista.getInstance().adV9.size(); i++){
            String nome = PainelLista.getInstance().adV9.get(i).getNome();
            int indice = Integer.parseInt(nome.substring(1));
            int indiceAdjacencia = PainelLista.getInstance().adV9.indexOf
                                        (PainelLista.getInstance().adV9.get(i));  
           arestasV9[indice-1] = PainelLista.getInstance().adV9.get(indiceAdjacencia).getPeso(); 
        }
        Vertice v9 = new Vertice(9, "V9", arestasV9);
        
        //converte 10 vertice
        int arestasV10[] = new int[Lista.getInstance().getTamanhoLista()+1];
        for(int i=0; i< PainelLista.getInstance().adV10.size(); i++){
            String nome = PainelLista.getInstance().adV10.get(i).getNome();
            int indice = Integer.parseInt(nome.substring(1));
            int indiceAdjacencia = PainelLista.getInstance().adV10.indexOf
                                        (PainelLista.getInstance().adV10.get(i));  
           arestasV10[indice-1] = PainelLista.getInstance().adV10.get(indiceAdjacencia).getPeso(); 
        }
        Vertice v10 = new Vertice(10, "V10", arestasV10);
        
        for(int i=0; i<Lista.getInstance().getTamanhoLista(); i++){
            System.out.println(arestasV10[i]);
        }
        
        List <Vertice> vertices = new ArrayList<>();
        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);
        vertices.add(v4);
        vertices.add(v5);
        vertices.add(v6);
        vertices.add(v7);
        vertices.add(v8);
        vertices.add(v9);
        vertices.add(v10);
        return vertices;
    }

}
