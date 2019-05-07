package com.unip.app.model;

import com.unip.app.view.configurator.WindowConfigurator;
import com.unip.app.view.panels.MatrizPanel;
import com.unip.app.view.windows.MatrizWindow;
import java.util.List;
import javax.swing.JOptionPane;

public class Matriz {
    private List <Vertice> vertices;
    private int tamanhoMatriz;
    private static Matriz instance;
    
    public Matriz(){
        
    }
        
    public static Matriz getInstance() {
        if(instance == null){
            instance = new Matriz();
        }return instance;
    }
    
    public static void clear(){
        instance = null;
    }
    
    public int getTamanhoMatriz() {
        return tamanhoMatriz;
    }
    
    public void setTamanhoMatriz(){         
            try{
                tamanhoMatriz = Integer.parseInt
                    (JOptionPane.showInputDialog("Informe o número de Vértices (Máximo :10)"));
                if (tamanhoMatriz > 0 && tamanhoMatriz <11){
                    GerenciadorVertice.clear();
                    MatrizPanel.clear();
                    WindowConfigurator.showWindow(new MatrizWindow());
                }else{
                    JOptionPane.showMessageDialog(null, "Informe um número maior que 0 ou menor que 11");
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ação cancelada pelo usuário");
            }
        
          
    }
    
     public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }


}
