public class GatosSelvagens extends Animal{

    private String corPelo;
    private String tiposMancha;

    public GatosSelvagens(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPelo, String tiposMancha) {
        super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
        setCorPelo(corPelo);
        setTiposMancha(tiposMancha);
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        if (!corPelo.equalsIgnoreCase("Preto") && !corPelo.equalsIgnoreCase("pardo")){
            throw new IllegalArgumentException("Cor do pelo invalido");
        }
        this.corPelo = corPelo;
    }

    public String getTiposMancha() {
        return tiposMancha;
    }

    public void setTiposMancha(String tiposMancha) {
        if (!tiposMancha.equalsIgnoreCase("Ausente") &&
                !tiposMancha.equalsIgnoreCase("Pintado") &&
                !tiposMancha.equalsIgnoreCase("listrado")){
            throw new IllegalArgumentException("Tipo de mancha invalida");
        }
        this.tiposMancha = tiposMancha;
    }

    @Override
    public String toString() {
        return super.toString()+
                "corPelo='" + corPelo + '\'' +
                ", tiposMancha='" + tiposMancha + '\'' +
                '}';
    }
}
