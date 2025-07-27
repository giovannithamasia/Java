
package aula_15_04_25;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Informe o publico total do jogo: ");
        double publico= sc.nextDouble();
        
        double popular=(publico*10/100)*5.00;
        double geral = (publico*50/100)*10.00;
        double arquibancada = (publico*30/100)*20.00;
        double cadeiras = (publico*10/100)*30.00;
        
        double renda = popular+geral+arquibancada+cadeiras;
          
        System.out.println(" A renda do jogo é: R$ "+renda); 
        
        sc.close();
    }
    
}
