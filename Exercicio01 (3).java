
package aula_10_06_25;


//Soma de 1 a N
//Crie um m�todo que receba um n�mero inteiro n como par�metro e retorne
//a soma de todos os n�meros de 1 at� n

public class Exercicio01 {
    
    
    public static int  calcularSoma(int num){
        int soma=0;
            for (int i = 1; i <= num; i++) {
                 soma+=i; 
                 
        }
         return soma;
       
    }

}