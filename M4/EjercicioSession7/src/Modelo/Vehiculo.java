package Modelo;

public abstract class Vehiculo {
    private int numeroRuedas;
    private int cantVentanas;

    public Vehiculo(int numeroRuedas, int cantVentanas) {
        this.numeroRuedas = numeroRuedas;
        this.cantVentanas = cantVentanas;
    }

    public Vehiculo() {

    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public int getCantVentanas() {
        return cantVentanas;
    }

    public void setCantVentanas(int cantVentanas) {
        this.cantVentanas = cantVentanas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numeroRuedas=" + numeroRuedas +
                ", cantVentanas=" + cantVentanas +
                '}';
    }
}
