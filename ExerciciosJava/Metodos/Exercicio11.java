import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] vetor = new double[5];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Numero "+(i+1)+ " : ");
            vetor[i] = sc.nextDouble();
        }
        System.out.println("Maior valor: "+calcularMaior(vetor));
        System.out.println("Menor valor: "+calcularMenor(vetor));
        System.out.println("Media dos valores: "+calcularMedia(vetor));

        sc.close();


    }
    public static double calcularMaior(double [] vetor){

        double maior = Double.MIN_VALUE;



        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i]>maior){
                maior = vetor[i];

            }


        }
        return maior;
    }
    public static double calcularMenor(double [] vetor){
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i]<menor){
                menor = vetor[i];
            }
        }
        return menor;
    }
    public static double calcularMedia(double [] vetor){
        double soma =0 ;

        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i];

        }
        double media = soma/vetor.length;


        return media;
    }

}
