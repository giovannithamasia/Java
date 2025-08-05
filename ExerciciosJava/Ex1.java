package aula_27_05_25;
import java.util.ArrayList;
import java.util.Scanner;





public class Ex1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crie um programa que gerencie o cadastro de produtos em uma loja. Peça ao 
        //usuário para adicionar produtos a uma lista e exiba todos os produtos 
        //cadastrados.
        
        ArrayList<String> produtos = new ArrayList<>();
        
        int opcao = 5;
        
       while(opcao !=3){
           System.out.println("1 - Cadastrar produtos ");
           System.out.println(" 2 - Visualizar produtos cadastrados ");
           System.out.println(" 3 - Sair ");
           System.out.println("Informe a opcao: ");
           opcao = sc.nextInt();
           
           sc.nextLine();
           if (opcao == 1){
               System.out.println("Informe o nome dos produtos: ");
               String produto = sc.nextLine();
               
               produto = produto.toLowerCase();
               
               if (produtos.contains(produto)){
                   System.out.println("Produto ja cadastrado");
               }
               else{
                   produtos.add(produto);
                   System.out.println("Produto cadastrado com sucesso!");
               }
            }
           else if (opcao == 2){
               for (String p:produtos){
                   System.out.println(p);
               }
           }
           else if (opcao == 3){
               System.out.println("Saindo...");
               break;
           }
           else{
               System.out.println("Opcao Invalida!");
           }
              
       }
       sc.close();
       
      
       
        
    }
    
}
