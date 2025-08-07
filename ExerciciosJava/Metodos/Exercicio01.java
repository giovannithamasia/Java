import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();

        switch(numero){
            case 1:
                calcularVerao();
                break;
            case 2:
                calcularOutono();
                break;
            case 3:
                calcularInverno();
                break;
            case 4:
                calcularPrimavera();
                break;
            default:
                System.out.println("Numero Invalido!");
        }
    }



    public static void calcularVerao() {
        System.out.println("É verao e esta quente");
    }
    public static void calcularOutono(){
        System.out.println("É outono e o clima esta favoravel");
    }
    public static void calcularInverno(){
        System.out.println("É inverno e esta frio");
    }
    public static void calcularPrimavera(){
        System.out.println("É primavera e o clima esta ameno");
    }


}

