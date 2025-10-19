public class Ex02 {
    public static void main(String[] args) {

        Mercado unidadeDeBlumenau = new Mercado();
        Mercado unidadeDeJoinville = new Mercado();
        Mercado unidadeDeFlorianopolis = new Mercado();

        unidadeDeBlumenau.nomemercado = " Carol ";
        unidadeDeBlumenau.macasvendano = 300;
        unidadeDeBlumenau.precomacas = 5.00;
        unidadeDeBlumenau.laranvendano = 200;
        unidadeDeBlumenau.precolaran = 4.00;

        unidadeDeJoinville.nomemercado = " Top ";
        unidadeDeJoinville.macasvendano = 800;
        unidadeDeJoinville.precomacas = 6.50;
        unidadeDeJoinville.laranvendano = 900;
        unidadeDeJoinville.precolaran = 5.50;

        unidadeDeFlorianopolis.nomemercado = " Cooper ";
        unidadeDeFlorianopolis.macasvendano = 1200;
        unidadeDeFlorianopolis.precomacas = 7.00;
        unidadeDeFlorianopolis.laranvendano = 1000;
        unidadeDeFlorianopolis.precolaran = 6.00;

        System.out.println("Unidade Blumenau Mercado "+unidadeDeBlumenau.nomemercado);
        System.out.println("\nUnidade Joinville Mercado "+unidadeDeJoinville.nomemercado);
        System.out.println("\nUnidade Florianopolis Mercado "+unidadeDeFlorianopolis.nomemercado);

    }
}
