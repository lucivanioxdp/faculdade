package com.unip.app.model;

public class Adjacencia {
    private int id = 1;
    private String nome;
    private int peso;

    public Adjacencia(){
        this.id = id++;
    }
    
    public Adjacencia(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
