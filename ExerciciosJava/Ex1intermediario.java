
package exvetores;

import java.util.Scanner;

//Leia 10 números e diga quantos são pares.

public class Ex1intermediario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] numeros = new int[10];
        int pares=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um numero: ");
            numeros[i] =sc.nextInt();
            if (numeros[i]%2==0){
               pares++;
            }
        }
        System.out.println("O total de numeros pares é: "+pares);
        
        sc.close();
}
}