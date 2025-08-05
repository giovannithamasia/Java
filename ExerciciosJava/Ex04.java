import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero: ");
        int num = sc.nextInt();

        sequencia(num);

    }

    public static void sequencia(int numero){
        for (int i = 0; i <=20; i++) {
            System.out.print(numero+i+ " ");
        }
    }
}
