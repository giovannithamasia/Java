
package exercicioswhile;

import java.util.Scanner;


public class ExercicioWhile02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        int n = sc.nextInt();
      
        
        while (n>=0){
            System.out.println(n);
            n--;
        }
       
        sc.close();
    }
}
