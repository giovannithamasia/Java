import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[5];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Numero "+(i+1));
            vetor[i] = sc.nextInt();
        }
        calcularmaior(vetor);
        calcularmenor(vetor);
        calcularMedia(vetor);

        sc.close();

    }
    public static void calcularmaior(int [] vetor) {

        int maior = Integer.MIN_VALUE;


        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]>maior){
                maior = vetor[i];
            }
        }
        System.out.println("Maior "+maior);
    }
    public static void calcularmenor(int [] vetor){

        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]<menor){
                menor = vetor[i];
            }
        }
        System.out.println("Menor "+menor);
    }
    public static void calcularMedia(int [] vetor){
        int soma =0;
        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i];

        }
        int media = soma/vetor.length;

        System.out.println("Media "+ media);
    }


}
