import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("informe um nome ");
        String nome = sc.nextLine();

        if (nome.equalsIgnoreCase("joao")){
            joao();
        }
        else if (nome.equalsIgnoreCase("Lima")){
            lima();
        }
        else{
            cleiton();
        }

    }


    public static void joao(){

        System.out.println("O nome dele é João");
        System.out.println("Ele tem 17 anos");
        System.out.println("Ele é estudante do SENAI");

    }

    public static void lima(){

        System.out.println("O nome dele é Lima");
        System.out.println("Ele tem 19 anos");
        System.out.println("Nao é estudante do SENAI");
    }

    public static void cleiton(){

        System.out.println("O nome dele é Cleiton");
        System.out.println("Ele tem 24 anos");
        System.out.println("Ele é estudante do SENAI");
    }
}
