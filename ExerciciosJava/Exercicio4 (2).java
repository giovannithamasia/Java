
package aula_27_05_25;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Desenvolva um programa que permita o cadastro de clientes de uma loja e 
        //mostre quantos clientes foram cadastrados.
        ArrayList<String> clientes = new ArrayList<>();
        
        int opcao = 5,tot=0;
                
        while (opcao!=3){
            System.out.println("1 - Cadastro de clientes ");
            System.out.println(" 2 - Quantos clientes cadastrados ");
            System.out.println(" 3 - Sair");
            System.out.println("Informe a opcao desejada: ");
            opcao = sc.nextInt();
            
            sc.nextLine();
            
            if (opcao == 1){
                System.out.println("Informe o nome: ");
                String nome = sc.nextLine();
                if (clientes.contains(nome)){
                    System.out.println("Cliente ja cadastrado ");
                }
                else{
                    clientes.add(nome);
                    tot++;
                    System.out.println("Cliente cadastrado! ");
                }
            }
            else if (opcao == 2){
                System.out.println("O total clientes cadastrados é: "+tot);
                
                System.out.println("\nClientes cadastrados");
                for (int i = 0; i < clientes.size(); i++) {
                    System.out.println(" -  "+clientes.get(i));
                }
            }
            else if (opcao == 3){
                 System.out.println("Saindo...");
                 break;
             }
             
             else {
                 System.out.println("Opcao Invalida!");
             }
        }
        
        
        
        
        
        sc.close();
    }
}
