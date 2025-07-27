
package aula_15_04_25;

import java.util.Scanner;


public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Informe o valor de A: ");
        double A = sc.nextInt();
        
        System.out.println(" Informe o valor de B: ");
        double  B = sc.nextInt();
        
        double quadrado1= Math.pow(A,2);
        double quadrado2 = Math.pow(B, 2);
        double  somadosquadrados = quadrado1+quadrado2;
        
        System.out.println(" A soma dos quadrados é: "+somadosquadrados);
        
        sc.close();
                
    }
}
