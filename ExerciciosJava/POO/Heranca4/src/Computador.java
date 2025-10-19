public class Computador implements Dispositivo{

    private String modelo;
    private boolean conectado;

    public Computador(String modelo, boolean conectado) {
        setModelo(modelo);
        this.conectado = conectado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo==null || modelo.isBlank()){
            throw  new IllegalArgumentException("Modelo invalido");
        }
        this.modelo = modelo;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    @Override
    public boolean ligar() {
        if (!isConectado()){
           return false;
        }
        return true;
    }

    @Override
    public boolean desligar() {
        if (ligar()){
            return true;
        }
        return false;
    }

    @Override
    public String obterStatus() {
        return "Modelo "+getModelo()+ " conectado "+isConectado();
    }
}
