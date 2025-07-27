
package aula_15_04_25;

import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Informe o valor de A: ");
        int A = sc.nextInt();
        
        System.out.println(" Informe o valor de B: ");
        int B = sc.nextInt();
        
        
        int calc=A;
        A=B;
        B= calc;
         
        System.out.println(" O valor de A é: "+A);
        System.out.println(" O valor de B é: "+B);
         
        sc.close();
        
    }
    
}
