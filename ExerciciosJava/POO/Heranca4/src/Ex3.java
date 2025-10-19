
public class Ex3 {
    public static void main(String[] args) {
        Computador p1 = new Computador("PC Gamer Ryzen i9",true);
        Notebook n1 = new Notebook("Axer i9 4060",11,true);

        System.out.println(p1.ligar());
        System.out.println(p1.desligar());
        System.out.println(p1.obterStatus());


        System.out.println(n1.ligar());
        System.out.println(n1.desligar());
        System.out.println(n1.obterStatus());



        }
    }
