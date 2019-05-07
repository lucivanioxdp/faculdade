package com.unip.app.dao;

import com.unip.app.model.Matriz;
import com.unip.app.model.Vertice;
import com.unip.app.view.panels.MatrizPanel;
import java.util.ArrayList;
import java.util.List;

public class VerticeMemoria {
    private List<Vertice> vertices;
    private int verticeVazio[];
    private Matriz matriz;
    private static int contador = 1;
    
    public VerticeMemoria(){
        vertices = new ArrayList<>();
        //quantidade de vertices 
        int c = Matriz.getInstance().getTamanhoMatriz();
        verticeVazio = new int[c];
        //ação para popular os vertices iniciais com 0
        for(int i = 0; i<c; i++){
                verticeVazio[i]=0;
        }
        //cria uma lista vazia de arestas até o valor do tamanho da matriz
        int a = 1; //variavel para acumular o nome do vertice
        for (int i = 0; i<c; i++){
            vertices.add(new Vertice(contador++,"V"+a, verticeVazio));
            a++;
        }
    }
    
    public void incluir(Vertice vertice) throws DaoException{
        if(vertice != null){
            vertices.add(vertice);
        }else{
            throw new DaoException("Vertice vazio");
        }
    }
    
    public void atualizar(Vertice vertice) throws DaoException{
        if(vertice != null){
            //até o vertice atual atingir o tamnho da lista
            for(Vertice verticeAtual: vertices){
                //vai pegar o valor do indice da linha selecionada
                int indice = MatrizPanel.getInstance().getLinhaSelecionada();
                //troca o vertice da linha selecionada pelo novo vertice
                vertices.set(indice, vertice);    
            }
        }else {
            throw new DaoException("Lançamento nulo");    
        } 
    }
    
    public void excluir(Vertice vertice) throws DaoException {
        if (vertice != null) {
            vertices.remove(vertice);
        } else {
            throw new DaoException("Vertice nulo");
        }
    }
    
    public List<Vertice> getTodos() throws DaoException {
        return vertices;
    }
    
    
}
