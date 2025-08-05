package exvetores;

import java.util.Scanner;

public class Ex4avancado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do primeiro vetor
        System.out.print("Digite o número de elementos do primeiro vetor: ");
        int tamanhoVetor1 = scanner.nextInt();

        // Criando o primeiro vetor
        int[] vetor1 = new int[tamanhoVetor1];

        // Solicita os elementos do primeiro vetor
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanhoVetor1; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Solicita o tamanho do segundo vetor
        System.out.print("Digite o número de elementos do segundo vetor: ");
        int tamanhoVetor2 = scanner.nextInt();

        // Criando o segundo vetor
        int[] vetor2 = new int[tamanhoVetor2];

        // Solicita os elementos do segundo vetor
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanhoVetor2; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Criando o vetor3 com o tamanho combinado dos dois vetores
        int[] vetor3 = new int[tamanhoVetor1 + tamanhoVetor2];

        // Copiando os elementos de vetor1 para vetor3
        int i;
        for (i = 0; i < tamanhoVetor1; i++) {
            vetor3[i] = vetor1[i];
        }

        // Copiando os elementos de vetor2 para vetor3
        for (int j = 0; j < tamanhoVetor2; j++, i++) {
            vetor3[i] = vetor2[j];
        }

        // Exibindo o vetor resultante
        System.out.print("Vetor 3 (combinado): ");
        for (int k = 0; k < tamanhoVetor1 + tamanhoVetor2; k++) {
            System.out.print(vetor3[k] + " ");
        }

        // Fechar o scanner
        scanner.close();
    }
}
