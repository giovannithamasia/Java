
package aula_10_06_25;


//Soma de 1 a N
//Crie um método que receba um número inteiro n como parâmetro e retorne
//a soma de todos os números de 1 até n

public class Exercicio01 {
    
    
    public static int  calcularSoma(int num){
        int soma=0;
            for (int i = 1; i <= num; i++) {
                 soma+=i; 
                 
        }
         return soma;
       
    }

}