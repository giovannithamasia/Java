import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();

        System.out.println(calcularParouImpar(numero));

        sc.close();
    }
    public static boolean calcularParouImpar(int numero){
        if (numero%2==0){
            System.out.println("Par");
            return true;
        }
        else {
            System.out.println("Impar");
            return false;
        }
    }

}
