package com.unip.app.model;

import com.unip.app.dao.DaoException;
import com.unip.app.dao.VerticeMemoria;
import com.unip.app.view.panels.MatrizPanel;
import java.util.List;

public class GerenciadorVertice {
    private static GerenciadorVertice instance;
    
    private GerenciadorVertice(){
        
    }
    
    public static GerenciadorVertice getInstance(){
        if(instance == null){
            instance = new GerenciadorVertice();
        }return instance;
    }
    
    public static void clear(){
        instance = null;
    }
    
    //objeto que utiliza os metodos de gerenciamento de dados dos vertices
    private VerticeMemoria dao = new VerticeMemoria();
    
    public void salvar(Vertice vertice) throws DaoException{
       try{
        boolean novo = vertice.getId() != MatrizPanel.getInstance().
                getVerticeSelecionada().getId() && vertice.getId() != vertice.getId();
        if(novo){
            dao.incluir(vertice);
        }else{
            dao.atualizar(vertice);
            //funciona
        }
       }catch(Exception ex){
           System.out.print("Erro");
       }
    }
    
    public void excluir(Vertice vertice) throws DaoException{
        dao.excluir(vertice);
    }
    
    public List<Vertice> getTodos() throws DaoException{
        return dao.getTodos();
    }
}
