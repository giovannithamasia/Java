
public class Empregado {

        String identificacao;
        String nome;
        String sobrenome;
        double salario;

        public double calcularSalAnual(){
                return salario*12;
        }
        public String construirNomeCompleto(){
                return nome+ " "+sobrenome;
        }
        public double calcularSalComAumento(double perAumento){
                return calcularSalAnual()+(calcularSalAnual()*perAumento/100);
        }

        }

