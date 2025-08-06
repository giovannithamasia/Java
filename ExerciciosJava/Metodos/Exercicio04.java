public class Exercicio04 {
    public static void main(String[] args) {
        int [] vetor = {1,3,5,7,9};


        maior(vetor);
        menor(vetor);
        media(vetor);

    }
    public static void maior(int [] vetor) {

        int  maior = Integer.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]>maior){
                maior=vetor[i];
            }
        }

        System.out.println("Maior "+maior);
    }
    public static void menor(int [] vetor){

        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]<menor){
                menor = vetor[i];
            }
        }
        System.out.println("Menor "+menor);
    }
    public static void media(int [] vetor){
        int soma =0;
        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i];
        }
        double media =(double) soma/ vetor.length;
        System.out.println("Media "+media);
    }

}
