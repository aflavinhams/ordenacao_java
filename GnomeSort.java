package com.mycompany.ordenacao;

public class GnomeSort {
    
    public void imprimir(int array[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + "->");
        System.out.println("Fim");
    }
    
    public Resultado ordenar(int array[], int n) 
    { 
        int trocas = 0;
        int iteracao = 0;
        int i = 1; 
  
        while (i < n) { 
            if(array[i] == 0){
                i++;
                iteracao += 1;
            }
            if (array[i] >= array[i - 1]) {
                i++; 
                iteracao += 1;
            }
            else {  
                trocas += 1;
                iteracao += 1;
                int atual = array[i]; 
                array[i] = array[i - 1]; 
                array[i - 1] = atual; 
                
                if (i > 1) {
                    i--;
                } else {
                    i = 1;
                }
            } 
        }
        
        Resultado resultado = new Resultado(iteracao, trocas);
        return resultado;
    } 
  
}
