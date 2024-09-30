package Objects;

import Instancias.Acciones;

public class DirectorTecnico extends Personas implements Acciones {
    private int antiguedad;

    public DirectorTecnico() {
        super();
    }

    public DirectorTecnico(int antiguedad, String nombre, String apellido, int edad) {
        super( nombre, apellido, edad );
        this.antiguedad = antiguedad;


    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    @Override
    public String toString() {
        return "Director Técnico: " + super.toString() + ", Antigüedad: " + antiguedad + " años";
    }

    @Override
    public void Celebrar() {
        System.out.println("El Director Técnico celebra el gol del equipo");

    }

    @Override
    public void Hablar() {
        System.out.println("El Director Técnico da instrucciones al equipo");

    }

    @Override
    public void Amonestacion(String tipoTarjeta) {
        System.out.println("El Director Técnico recibe tarjeta " + tipoTarjeta);

    }


}
