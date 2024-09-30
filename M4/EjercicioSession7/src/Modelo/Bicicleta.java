package Modelo;


public class Bicicleta extends Vehiculo{
    private String tipoBicicleta;

    public Bicicleta(int numeroRuedas, int cantVentanas, String tipoBicicleta) {
        super(numeroRuedas, cantVentanas);
        this.tipoBicicleta = tipoBicicleta;
    }

    public Bicicleta() {
        super();
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;


    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipoBicicleta='" + tipoBicicleta + '\'' +
                '}';
    }
}
