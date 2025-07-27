
package aula_10_06_25;


public class Exercicio06 {
    
    public static int calcularFatorial(int num){
        int fatorial = 1;
        for (int i = num; i >=1; i--) {
            fatorial*=i;
        }
        return fatorial;
    }
}
