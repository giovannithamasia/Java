import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1:");
        double nota = sc.nextDouble();

        System.out.println("Nota 2:");
        double nota2 = sc.nextDouble();

        System.out.println("Nota 3:");
        double nota3 = sc.nextDouble();

        System.out.println("Media igual : "+calcularMedia(nota,nota2,nota3));


        sc.close();
    }
    public static double calcularMedia(double nota,double nota2,double nota3){
        return (nota+nota2+nota3)/3;
    }
}
