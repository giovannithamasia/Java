
package exvetores;

import java.util.Scanner;


public class Ex4intermediario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] numeros = new int[10];
        int soma=0;
        double media;
      
        
        for (int i = 0; i < 10; i++) {
            System.out.println("informe um numero: ");
            numeros[i] = sc.nextInt();
            soma+=numeros[i];
    }
        media = soma/10;
        System.out.println("A media dos numeros é: "+media);
        
        sc.close();
}
}