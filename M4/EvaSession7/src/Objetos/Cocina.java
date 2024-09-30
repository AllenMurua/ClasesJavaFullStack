package Objetos;

import Interfaces.CocinaInterface;

public class Cocina extends Producto implements CocinaInterface {
    private int cantCalentadores;

    public Cocina() {}

    public Cocina(int cantCalentadores, int precio, int cantidad) {
        super(cantidad,precio);
        this.cantCalentadores = cantCalentadores;
    }
    public int getCantCalentadores() {
        return cantCalentadores;
    }

    public void setCantCalentadores(int cantCalentadores) {
        this.cantCalentadores = cantCalentadores;
    }


    public static void IncluyeGas() {
        System.out.println("Felicidades! Ha comprado su cocina Incluyendo un gas.");
    }

    @Override
    public String toString() {
        return "Cocina{" +
                "cantCalentadores=" + cantCalentadores +
                '}';
    }

    @Override
    public void cambiarPrecio() {

    }
}
