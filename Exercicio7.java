
package aula_15_04_25;

import java.util.Scanner;


public class Exercicio7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.println(" Informe o salario do funcionario é: ");
        double salario = sc.nextDouble();
        
        double reajuste= salario+(salario*15/100);
        
        System.out.println(" O salario final com reajuste: R$ "+reajuste);
        
        sc.close();
                
    }
    
}
