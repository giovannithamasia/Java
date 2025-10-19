public class Animal {

    private String raca;
    private String nomeIdentificacao;
    private String porte;
    private String habitat;
    private String paisOrigem;

    public Animal(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem) {
        setRaca(raca);
        setNomeIdentificacao(nomeIdentificacao);
        setPorte(porte);
        setHabitat(habitat);
        setPaisOrigem(paisOrigem);
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

    public String getNomeIdentificacao() {
        return nomeIdentificacao;
    }

    public void setNomeIdentificacao(String nomeIdentificacao) {
        if (nomeIdentificacao==null || nomeIdentificacao.isBlank()){
            throw new IllegalArgumentException("Nome de indentificacao invalido");
        }
        this.nomeIdentificacao = nomeIdentificacao;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        if (!porte.equalsIgnoreCase("Pequeno") && !porte.equalsIgnoreCase("Medio")
                && !porte.equalsIgnoreCase("Grande")){
            throw new IllegalArgumentException("Porte invalido");
        }
        this.porte = porte;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat==null || habitat.isBlank()){
            throw new IllegalArgumentException("Habitat invalido");
        }
        this.habitat = habitat;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        if (paisOrigem==null || paisOrigem.isBlank()){
            throw new IllegalArgumentException("Pais de origem invalido");
        }
        this.paisOrigem = paisOrigem;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "raca='" + raca + '\'' +
                ", nomeIdentificacao='" + nomeIdentificacao + '\'' +
                ", porte='" + porte + '\'' +
                ", habitat='" + habitat + '\'' +
                ", paisOrigem='" + paisOrigem + '\'' +
                ',';
    }
}
