package Modelo;

import Interfaces.InterfazVehiculo;

import java.sql.SQLOutput;
import java.util.Scanner;

public  class Auto extends Vehiculo implements InterfazVehiculo {
    private String modelo;
    private String color;
    public Auto(int numeroRuedas, int cantVentanas, String modelo, String color) {
        super(numeroRuedas, cantVentanas);
        this.modelo = modelo;
        this.color = color;
    }

    public Auto() {
        super();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void InterfazVehiculo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Que Bencina desea Cargar?");
        String bencina = sc.nextLine();
        System.out.println("Gracias por preferirnos, Bencina "+ bencina+" cargada!");
    }
}
