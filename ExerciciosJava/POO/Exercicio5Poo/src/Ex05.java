import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empregado emp1 = new Empregado();

        System.out.println("Identificação: ");
        emp1.identificacao = sc.nextLine();

        System.out.println("Nome: ");
        emp1.nome = sc.nextLine();

        System.out.println("Sobrenome: ");
        emp1.sobrenome = sc.nextLine();

        System.out.println("Salario mensal R$ :");
        emp1.salario = sc.nextDouble();

        double salAnual = emp1.calcularSalAnual();
        String nomeCompleto = emp1.construirNomeCompleto();
        double salfinal = emp1.calcularSalComAumento(15);
        String iden = emp1.identificacao;

        System.out.println("Identificação do Empregado "+iden);
        System.out.println("Nome Completo: "+nomeCompleto);
        System.out.printf("Salario Anual \nR$ %.2f",salAnual);
        System.out.printf("\nSalario final com aumento \nR$ %.2f",salfinal);

        sc.close();
    }
}
