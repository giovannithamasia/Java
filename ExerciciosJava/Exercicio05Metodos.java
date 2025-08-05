import java.util.Scanner;

public class Exercicio05Metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero base: ");
        int base = sc.nextInt();

        System.out.println("Informe o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Informe o ultimo numero: ");
        int num3 = sc.nextInt();

        calcularNumeroProximo(base,num2,num3);

        sc.close();
    }
    public static void calcularNumeroProximo(int base, int num2,int num3){

        int diferenca = base-num2;
        int dife = base-num3;

        if (base>num2 && base>num3) {
            if (diferenca < dife) {
                System.out.println(num2 + " o numero mais parte do numero base");
            } else {
                System.out.println(num3 + " o numero mais parte do numero base");
            }
        }
        else{
            int calc = num2-base;
            int calcc = num3-base;
            if (calc<calcc){
                System.out.println(num2+ " Numero mais perto do numero base");
            }
            else{
                System.out.println(num3+ " Numero mais perto do numero base");
            }
        }

    }

}
