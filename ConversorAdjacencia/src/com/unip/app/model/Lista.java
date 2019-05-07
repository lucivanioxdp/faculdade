package com.unip.app.model;

import com.unip.app.view.configurator.WindowConfigurator;
import com.unip.app.view.panels.PainelLista;
import com.unip.app.view.windows.ListaWindow;
import java.util.List;
import javax.swing.JOptionPane;

public class Lista {
     private List <Vertice> vertices;
    private int tamanhoLista;
    private static Lista instance;
    
    public Lista(){
        
    }
        
    public static Lista getInstance() {
        if(instance == null){
            instance = new Lista();
        }return instance;
    }
    
    public static void clear(){
        instance = null;
    }
    
    public int getTamanhoLista() {
        return tamanhoLista;
    }
    
    public void setTamanhoLista(){         
            try{
                tamanhoLista = Integer.parseInt
                    (JOptionPane.showInputDialog("Informe o número de Vértices (Máximo :10)"));
                if (tamanhoLista > 0 && tamanhoLista <11){
                    PainelLista.clear();
                    WindowConfigurator.showWindow(new ListaWindow());
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
