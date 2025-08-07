import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Limite Maximo: ");
        int limitemax = sc.nextInt();

        System.out.println("Limite Minimo: ");
        int limitemin = sc.nextInt();

        System.out.println("Numero : ");
        int numero = sc.nextInt();

        System.out.println(calcularLimite(numero,limitemax,limitemin));

         sc.close();

    }
    public static String calcularLimite (int numero,int limitemax,int limitemin){


        if (numero>=limitemin && numero<=limitemax){
            return numero+" esta dentro dos limites impostos";
        }
        else{
            return numero+" nao esta dentro dos limites impostos";
        }
    }
}
