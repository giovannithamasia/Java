
package aula_15_04_25;

import java.util.Scanner;


public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Informe o primeiro numero: ");
        int numero1=sc.nextInt();
        
        System.out.println(" Informe o segundo numero: ");
        int numero2 = sc.nextInt();
        
        System.out.println(" Informe o terceiro numero: ");
        int numero3 = sc.nextInt();
        
        System.out.println(" o primeiro numero informado é: "+numero1);
        System.out.println(" o segundo numero informado é: "+numero2);
        System.out.println(" o terceiro numero informado é: "+numero3);  
        
        sc.close();
    }
}
