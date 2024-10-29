package com.mycompany.ordenacao;

import java.util.Random;

public class Ordenacao {

    public static void main(String[] args) {
        
        long seed = 12345;
        int[] tamanhos = {1000, 10000, 100000, 500000, 1000000};
        int rodadas = 5;

        for(int tamanho:tamanhos){
            
            float media = 0;
            float t_total = 0;
            float i_total = 0;
            
            for (int rodada = 0; rodada < rodadas; rodada++) {
                Random random = new Random(seed + rodada);
                
                int[] array = new int[tamanho];
                for (int i = 0; i < tamanho; i++) {
                    array[i] = random.nextInt(100000); 
                }
                
                long inicio = System.currentTimeMillis();
                
                ShellSort teste = new ShellSort();
                //GnomeSort teste = new GnomeSort();
                
                Resultado resultado = teste.ordenar(array.clone(), tamanho);
                        
                long tempoExecucao = System.currentTimeMillis() - inicio;
                media += tempoExecucao;
                t_total += resultado.getTrocas();
                i_total += resultado.getIteracao();
                
            }
            System.out.println("Media de tempo do tamanho " + tamanho + " = " + media/5);
            System.out.println("Media de iteracoes do tamanho " + tamanho + " = " + i_total/5);
            System.out.println("Media de trocas do tamanho " + tamanho + " = " + t_total/5);
            System.out.println(" ");
        }
        
    }
}
