
package aula_10_06_25;


public class Exercicio09 {
    
    public static int[] inverterValor(int [] vetor){
        
        int [] invertido = new int [vetor.length];
        
        for (int i = 0; i < vetor.length; i++) {
           invertido[i] = vetor[vetor.length-1-i];
        }
       
    
        return invertido;
    }
   
}
