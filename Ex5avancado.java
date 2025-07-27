package exvetores;

import java.util.Scanner;

public class Ex5avancado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializando o vetor com capacidade inicial
        int[] vetor = new int[10];
        int tamanhoAtual = 0; // Para controlar o número de elementos no vetor
        int opcao = 0;

        // Loop do menu
        while (opcao != 6) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar dado");
            System.out.println("2 - Buscar dado");
            System.out.println("3 - Alterar dado");
            System.out.println("4 - Remover dado");
            System.out.println("5 - Exibir todos os dados");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) { // Adicionar dado
                if (tamanhoAtual < vetor.length) {
                    System.out.print("Digite o valor para adicionar: ");
                    int valor = scanner.nextInt();
                    vetor[tamanhoAtual] = valor;
                    tamanhoAtual++;
                    System.out.println("Dado adicionado com sucesso!");
                } else {
                    System.out.println("Vetor cheio! Não é possível adicionar mais dados.");
                }
            } 
            else if (opcao == 2) { // Buscar dado
                System.out.print("Digite o valor a ser buscado: ");
                int buscar = scanner.nextInt();
                boolean encontrado = false;
                for (int i = 0; i < tamanhoAtual; i++) {
                    if (vetor[i] == buscar) {
                        System.out.println("Valor " + buscar + " encontrado na posição " + i);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Valor não encontrado.");
                }
            } 
            else if (opcao == 3) { // Alterar dado
                System.out.print("Digite o valor a ser alterado: ");
                int alterar = scanner.nextInt();
                System.out.print("Digite o novo valor: ");
                int novoValor = scanner.nextInt();
                boolean alterado = false;
                for (int i = 0; i < tamanhoAtual; i++) {
                    if (vetor[i] == alterar) {
                        vetor[i] = novoValor;
                        System.out.println("Valor alterado com sucesso!");
                        alterado = true;
                        break;
                    }
                }
                if (!alterado) {
                    System.out.println("Valor não encontrado.");
                }
            } 
            else if (opcao == 4) { // Remover dado
                System.out.print("Digite o valor a ser removido: ");
                int remover = scanner.nextInt();
                boolean removido = false;
                for (int i = 0; i < tamanhoAtual; i++) {
                    if (vetor[i] == remover) {
                        // Deslocando os elementos para remover o valor
                        for (int j = i; j < tamanhoAtual - 1; j++) {
                            vetor[j] = vetor[j + 1];
                        }
                        tamanhoAtual--;
                        System.out.println("Valor removido com sucesso!");
                        removido = true;
                        break;
                    }
                }
                if (!removido) {
                    System.out.println("Valor não encontrado.");
                }
            } 
            else if (opcao == 5) { // Exibir todos os dados
                if (tamanhoAtual == 0) {
                    System.out.println("O vetor está vazio.");
                } else {
                    System.out.print("Dados no vetor: ");
                    for (int i = 0; i < tamanhoAtual; i++) {
                        System.out.print(vetor[i] + " ");
                    }
                    System.out.println();
                }
            }
            else if (opcao != 6) {
                // Caso a opção não seja válida
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Saindo do sistema.");
        scanner.close();
    }
}
