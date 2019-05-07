package com.unip.app.model;

import java.util.Objects;

public class Vertice {
    String nomeVertice;
    int aresta[];
    int id;
    
    public Vertice(){
        
    }
    
    public Vertice(int id, String nome, int aresta[]){
        this.id = id;
        this.nomeVertice = nome;
        this.aresta = aresta;
    }
    public String getNomeVertice() {
        return nomeVertice;
    }

    public void setNomeVertice(String nomeVertice) {
        this.nomeVertice = nomeVertice;
    }
    //retorna todas as arestas
    public int[] getAresta(){
        return aresta;
    }
    //retorna aresta especificada
    public int getAresta(int index) {
        int a = aresta[index];
        return a;
    }
    

    public void setAresta(int[] aresta) {
        this.aresta = aresta;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        hash = 19 * hash + Objects.hashCode(this.nomeVertice);
        hash = 19 * hash + Objects.hashCode(this.aresta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vertice other = (Vertice) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.aresta != other.aresta) {
            return false;
        }
        if (this.nomeVertice != other.nomeVertice) {
            return false;
        }
        return true;
    }
    
   /* @Override
    public String toString() {
        return "Lancamento{" + "id=" + id + ", tipo="
}*/
}
