public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String especie, double peso, String raca) {
        super(especie, peso);
        setRaca(raca);
    }

    @Override
    public String emitirSom() {
        return "Au,Au!";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca==null || raca.isBlank()){
            throw new IllegalArgumentException("Raca invalida");
        }
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString()+
                "raca='" + raca + '\'' +
                '}';
    }
}
