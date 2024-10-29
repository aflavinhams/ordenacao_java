package com.mycompany.ordenacao;

public class ShellSort{
    
    // metodo só pra printar o array
    public void imprimir(int array[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + "->");
        System.out.println("Fim");
    }

    public Resultado ordenar(int array[], int n)
    {
        int trocas = 0;
        int iteracoes = 0;
     
        //inicia na metade do array e vai sempre dividindo pela metade
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2)
        {
            
            for (int i = intervalo; i < n; i += 1)
            {
                int atual = array[i];

                int j;
                
                // enquanto j for maior ou igual ao intervalo e o item da outra metade seja maior que o atual
                for (j = i; j >= intervalo && array[j - intervalo] > atual; j -= intervalo){
                    // troca o na posicao atual pelo maior
                    array[j] = array[j - intervalo];
                    iteracoes += 1;
                }
                    
                // troca o da posicao da primeira metade pelo menor
                array[j] = atual;
                trocas += 1;
                
            }
        }
        Resultado resultado = new Resultado(iteracoes, trocas);
        return resultado;
    }


}