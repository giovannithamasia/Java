
public class Ex01{
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        p1.nome = "Lima Duarte";
        p1.sexo = 'M';
        p1.datadenasc = "10/07/2005";
        p1.estadocivil = "Solteiro";

        Pessoa p2 = new Pessoa();

        p2.nome = "Maria Clara";
        p2.sexo = 'F';
        p2.datadenasc = "09/07/2010";
        p2.estadocivil = "Casada";

        System.out.println("Pessoa 1\nnome "+p1.nome+ " sexo "+p1.sexo);
        System.out.println("\nPessoa 2\nnome "+p2.nome+ " sexo "+p2.sexo);


    }
}
