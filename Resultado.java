/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao;

/**
 *
 * @author apaul
 */
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
