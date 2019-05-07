package com.unip.app.view.panels;

import com.unip.app.model.Vertice;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class MatrizTableModel extends AbstractTableModel{

    private List <Vertice> vertices;
   
    public MatrizTableModel(List<Vertice> vertices){
        this.vertices = vertices;
    }
    
    @Override
    public int getRowCount() {
        return vertices.size();
    }

    @Override
    public int getColumnCount() {
        return vertices.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        for (int i=0; i < vertices.size(); i++){
            if (i == columnIndex){
                ++i;
                return "V"+i;
            }
        }return "";
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }
 
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        for (int i=0; i < vertices.size(); i++){
            if (i == columnIndex){
                return Integer.class;
            }
        }return Object.class;
    }
        
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vertice verticeAtual = vertices.get(rowIndex);
       switch (columnIndex) {
            case 0:
                return verticeAtual.getAresta(0);
            case 1:
                return verticeAtual.getAresta(1);
            case 2:
                return verticeAtual.getAresta(2);
            case 3:
                return verticeAtual.getAresta(3);
            case 4:
                return verticeAtual.getAresta(4);
            case 5:
                return verticeAtual.getAresta(5);
            case 6:
                return verticeAtual.getAresta(6);
            case 7:
                return verticeAtual.getAresta(7);
            case 8:
                return verticeAtual.getAresta(8);
            case 9:
                return verticeAtual.getAresta(9);
            case 10:
                return verticeAtual.getAresta(10);
        }
        return "";
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
       //vazio
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
       
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        //vazio
    }
 
    public Vertice getVertice(int linha){
        return vertices.get(linha);
    }
    
}