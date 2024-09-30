package Objects;

import Instancias.Acciones;
import Instancias.InstanciaJugagores;

public class Futbolista extends Personas implements InstanciaJugagores , Acciones {
    private int numero;
    private String posicion;
    private Personas personas;

    public Futbolista() {
        super();
    }
    public Futbolista(int numero, String posicion, Personas personas) {
        super( );
        this.numero = numero;
        this.posicion = posicion;
        this.personas = personas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Jugador: " + super.toString() + ", Número: " + numero + ", Posición: " + posicion;
    }

    @Override
    public void Correr() {
        System.out.println("El jugador " + getNumero() + " está corriendo");

    }

    @Override
    public void QuitarBalon() {
        System.out.println("El jugador " + getNumero() + " quita el balón");

    }

    @Override
    public void Saltar() {
        System.out.println("El jugador " + getNumero() + " salta");

    }

    @Override
    public void Celebrar() {
        System.out.println("El jugador " + getNumero() + " celebra el gol");

    }

    @Override
    public void Hablar() {
        System.out.println("El jugador " + getNumero() + " habla con sus compañeros");

    }

    @Override
    public void Amonestacion(String tipoTarjeta) {
        System.out.println("El jugador " + getNumero() + " recibe tarjeta " + tipoTarjeta);

    }

}
