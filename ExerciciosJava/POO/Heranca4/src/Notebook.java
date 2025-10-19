public class Notebook  extends Computador  implements Dispositivo{


    private int bateria;


    public Notebook(String modelo, boolean conectado, int bateria) {
        super(modelo, conectado);
        setBateria(bateria);
    }


    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria<0){
            throw new IllegalArgumentException("Bateria invalida");
        }
        this.bateria = bateria;
    }

    @Override
    public boolean ligar() {
        if (isConectado() || getBateria()>10){
            return true;
        }
        return false;
    }

    @Override
    public boolean desligar() {
        return super.desligar();
    }

    @Override
    public String obterStatus() {
        return super.obterStatus()+ " bateria "+getBateria() ;
    }
}
