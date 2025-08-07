import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero base: ");
        int base = sc.nextInt();

        System.out.println("Informe o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Informe o ultimo numero: ");
        int num3 = sc.nextInt();

        calcularNumeroProximo(base, num2, num3);

        sc.close();
    }

    public static void calcularNumeroProximo(int base, int num2, int num3) {

        int diferenca = Math.abs(base - num2);
        int dife = Math.abs(base - num3);

        if (dife == diferenca) {
            System.out.println("Empate ");
        } else if (diferenca < dife) {
            System.out.println(num2 + " o numero mais proximo do numero base");
        } else {
            System.out.println(num3 + " o numero mais proximo do numero base");
        }

    }

}
