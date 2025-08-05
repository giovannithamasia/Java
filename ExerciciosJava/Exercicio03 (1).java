
package aula_10_06_25;



public class Exercicio03 {
    
    public static String ImprimirNome(int num,String nome){
      String nomes = "";
        for (int i = 0; i < num; i++) {
            nomes += nome+"\n";
        }
        return nomes;
    }
}
