
package aula_15_04_25;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Informe o primeiro numero: ");
        int numero1=sc.nextInt();
        
        System.out.println(" Informe o segundo numero: ");
        int numero2 = sc.nextInt();
        
        System.out.println(" Informe o terceiro numero: ");
        int numero3 = sc.nextInt();
        
        int soma = (numero1+numero2)*numero3;
        
        System.out.println(" O valor total é: "+soma);
        
        sc.close();
    }
}
