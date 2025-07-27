
package aula_28_04_25;

import java.util.Scanner;


public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int opcao=0 ;double saldo = 0;double saque=0;
        double totalsaque=0;double deposito=0;double totalfinaldeposito=0;
        
        System.out.println("Escolha a opcao desejada 1-Saldo"
                            + "\n2-Sacar"
                            +  "\n3-Depositar"
                            + "\n4-Sair" );
                                    
        
           while (opcao!=4){
               
               System.out.println("1- Consultar Saldo");
               
               System.out.println("2 - Sacar dinheiro ");
               
               System.out.println(" 3- Depositar");
               
               System.out.println(" 4- Sair");
               
               System.out.println("Informe a opcao escolhida: ");
               opcao = sc.nextInt();
               
               
               if (opcao == 1){
                   System.out.println("Informe seu saldo: ");
                   saldo = sc.nextDouble();
                   System.out.println("Seu saldo atual é de "+saldo);
               }
               else if (opcao==2){
                   System.out.println("Informe seu saldo: ");
                   saldo = sc.nextDouble();
                   System.out.println("informe o valor que quer sacar: ");
                    saque = sc.nextDouble();
                    if (saque>saldo){
                        System.out.println("Saldo insuficiente para saque");
                    }
                    else{
                        totalsaque = saldo - saque;
                        System.out.println("o saldo atualizado dele depois do saque é: "+totalsaque);
                    }
               }
               else if(opcao==3){
                   System.out.println("Informe seu saldo: ");
                   saldo = sc.nextDouble();
                   System.out.println("Informe o valor que quer depositar");
                   deposito = sc.nextDouble();
                   System.out.println("o valor do deposito foi "+deposito);
                   totalfinaldeposito = saldo+deposito;
                   System.out.println("O saldo final com o deposito foi de "+totalfinaldeposito);
                   
               }
               else if (opcao==4){
                   System.out.println("Sair");
               }
                    
                
           }   
                
                
    }
}
