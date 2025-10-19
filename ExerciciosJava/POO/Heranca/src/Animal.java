public  abstract class Animal {

    private String especie;
    private double peso;

    public Animal(String especie, double peso) {
        setEspecie(especie);
        setPeso(peso);
    }
    public abstract String emitirSom();

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie==null || especie.isBlank()){
            throw new IllegalArgumentException("Especie invalida");
        }
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso<=0){
            throw new IllegalArgumentException("Peso invalido");
        }
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", peso=" + peso + " ,";

    }
}
