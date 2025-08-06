public class Exercicio06 {
    public static void main(String[] args) {
        String nome = "Giovanni Thamasia";
        String sobrenome = "Solange";
        String cidade = "Blumenau";

        generateStarWarsName(nome,sobrenome,cidade);
    }

    public static void generateStarWarsName(String nome,String sobrenomemae,String cidade){

        String tresprimeirasletrassobrenome = nome.substring(8,12).trim();


        String duasprimeirasletras = nome.substring(0,2);


        String primeironome = tresprimeirasletrassobrenome+duasprimeirasletras;


        String sobrenome = sobrenomemae.substring(0,2)+cidade.substring(0,3);

        System.out.println(primeironome+ " " +sobrenome);


    }
}
