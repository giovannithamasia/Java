
package exvetores;

import java.util.Scanner;




public class Ex3intermediario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] numeros = new int[10];
        int maior,menor;
       
       
        
        System.out.println("informe um numero: ");
        numeros[0] = sc.nextInt();
        maior =numeros[0];
        menor = numeros[0];
        
        for (int i = 1; i < 10; i++) {
            System.out.println("informe um numero: ");
            numeros[i] = sc.nextInt();
            
            if (numeros[i]>maior){
                maior=numeros[i];
            }
            
            if (numeros[i]<menor){
                menor = numeros[i];
            }
        }
       
        System.out.println("o maior numero é: "+maior);
        System.out.println("O menor numero é: "+menor);
        
        sc.close();
        
}
}