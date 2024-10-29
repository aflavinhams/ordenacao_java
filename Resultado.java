package com.mycompany.ordenacao;

public class Resultado {
    
    int iteracao;
    int trocas;

    public Resultado(int iteracao, int trocas) {
        this.iteracao = iteracao;
        this.trocas = trocas;
    }

    public int getIteracao() {
        return iteracao;
    }

    public void setIteracao(int iteracao) {
        this.iteracao = iteracao;
    }

    public int getTrocas() {
        return trocas;
    }

    public void setTrocas(int trocas) {
        this.trocas = trocas;
    }
    
    
}
