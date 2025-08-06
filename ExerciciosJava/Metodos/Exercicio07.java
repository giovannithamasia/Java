import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero: ");
        int numero = sc.nextInt();

        switch(numero){
            case 1:
                System.out.println(calcularVerao());
                break;
            case 2:
                System.out.println(calcularOutono());
                break;
            case 3:
                System.out.println(calcularInverno());
                break;
            case 4:
                System.out.println(calcularPrimavera());
                break;
            default:
                System.out.println("Numero Invalido!");
        }



        sc.close();
    }
    public static String calcularVerao(){
        return "É verão e esta quente";
    }
    public static String calcularOutono(){
        return "É outono e a temperatura esta amena";
    }
    public static String calcularInverno(){
        return "É inverno e esta frio";
    }
    public static String calcularPrimavera(){
        return "É primavera,tambem conhecida como estacao das flores";
    }
}
