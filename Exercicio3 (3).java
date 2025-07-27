
package aula_27_05_25;
import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         //Crie um programa que permita ao usuário adicionar, remover e exibir tarefas de 
        //uma lista de afazeres (To-Do List)
         
         ArrayList<String> tarefas = new ArrayList<>();
         
         int opcao = 5;
         
         while(opcao!=4){
             System.out.println("1 - Adicionar tarefas a lista");
             System.out.println(" 2 - Remover tarefas da lista");
              System.out.println(" 3 - Exibindo tarefas");
             System.out.println(" 4 - Sair");
             System.out.println("Informe a opcao: ");
             opcao = sc.nextInt();
             
             sc.nextLine();
             if (opcao == 1){
                 System.out.println("Informe a tarefa que quer adicionar: ");
                 String tarefa = sc.nextLine();
                 
                 
                 if (tarefas.contains(tarefa)){
                     System.out.println("Tarefa ja cadastrada");
                 }
                 else{
                     tarefas.add(tarefa);
                     System.out.println("Tarefa cadastrada! ");
                 }
             }
             else if (opcao == 2){
                 System.out.println("Informe a tarefa que quer remover");
                 String tarefarem = sc.nextLine();
                 if (tarefas.contains(tarefarem)){
                   tarefas.remove(tarefarem);
                   
                     System.out.println("Tarefa removida com sucesso");
                }
                 else{
                     System.out.println("Tarefa nao encontrada");
                 }
             }
             else if (opcao == 3){
                 for (int i = 0; i < tarefas.size(); i++) {
                     System.out.println("Tarefas a fazer "+tarefas.get(i));
                 }
             }
             else if (opcao == 4){
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
