public class Aves extends Animal{

    private String corPena;
    private String tipoAlimentacao;

    public Aves(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPena, String tipoAlimentacao) {
        super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
        setCorPena(corPena);
        setTipoAlimentacao(tipoAlimentacao);
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        if (corPena==null || corPena.isBlank()){
            throw new IllegalArgumentException("Cor de pena invalida");
        }
        this.corPena = corPena;

    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        if (tipoAlimentacao==null || tipoAlimentacao.isBlank()){
            throw new IllegalArgumentException("Cor de pena invalida");
        }
        this.tipoAlimentacao = tipoAlimentacao;
    }

    @Override
    public String toString() {
        return super.toString()+
                "corPena='" + corPena + '\'' +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                '}';
    }
}
