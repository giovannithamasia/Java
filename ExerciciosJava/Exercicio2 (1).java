
package aula_27_05_25;
import java.util.ArrayList;



import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Simule uma lista de presença de uma turma. Adicione o nome dos alunos 
        //presentes e exiba os que estão presentes ao final
        
        ArrayList<String> nomes = new ArrayList();
        String nome;
        
       do{
           System.out.println("Informe o nome: ");
           nome = sc.nextLine();
           nome = nome.toLowerCase();
           if (!nome.equals("fim")){
               nomes.add(nome);
           }
           else{
               System.out.println("Digitou fim");
           }
           
           
           
           
           
           
       }while(!nome.equals("fim"));
        
        System.out.println("Alunos presentes no final ");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Alunos "+nomes.get(i));
        }
        
        
        sc.close();
    }
}
