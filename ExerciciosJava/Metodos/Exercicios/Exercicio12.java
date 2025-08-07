
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe a palavra: ");
        String palavra = sc.nextLine();

        System.out.println(calcularpalavra(palavra));

        sc.close();
    }
    public static char calcularpalavra(String palavra){


        if (palavra.length()%2==0){
            System.out.println("Palavra tem tamanho par");
            return palavra.charAt(0);
        }
        else{
            System.out.println("Palavra tem tamanho impar");
            return palavra.charAt(1);
        }
    }
}
