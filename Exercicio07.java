
package aula_10_06_25;


public class Exercicio07 {
    
    public static double calcularMedia(int [] vetor){
        int soma =0;
        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i];
        }
        return  soma/vetor.length;
    }
}
