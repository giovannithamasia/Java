
package aula_15_04_25;

import java.util.Scanner;


public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Informe um numero: ");
        int numero = sc.nextInt();
        
        int quadrado = numero*numero;
        
        System.out.println(" O quadrado do numero é: "+quadrado);
        
        sc.close();
    }
    
}
