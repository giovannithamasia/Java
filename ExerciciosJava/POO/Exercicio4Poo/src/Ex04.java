import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        Circulo c3 = new Circulo();
        Circulo c4 = new Circulo();
        Circulo c5 = new Circulo();

        c1.raio = 5.0;
        c2.raio = 10.00;
        c3.raio = 30.00;
        c4.raio = 100.00;
        c5.raio = 50.00;

        String cir1 = df.format(c1.calculararea());
        String cir2 = df.format(c2.calculararea());
        String cir3 = df.format(c3.calculararea());
        String cir4 = df.format(c4.calculararea());
        String cir5 = df.format(c5.calculararea());

        System.out.println("Circulo 1\nárea igual: "+cir1);
        System.out.println("\nCirculo 2\nárea igual: "+cir2);
        System.out.println("\nCirculo 3\nárea igual: "+cir3);
        System.out.println("\nCirculo 4\nárea igual: "+cir4);
        System.out.println("\nCirculo 5\nárea igual: "+cir5);


        sc.close();
    }
}
