package aula_10_06_25;

public class Exercicio08 {

    public static int contarVogais(String palavra) {
        int contador = 0;
        palavra = palavra.toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }
}