package com.unip.app.model;

public enum TipoAdjacencia {
    MATRIZ_ADJ{
        @Override
        public String toString(){
            return "Matriz de Adjacência";
        }
    },
    LISTA_ADJ{
        @Override
        public String toString(){
            return "Lista de Adjacência";
        }
    }

}
