package Objetos;

import Instancias.InterfaceClases;

public class Profesor implements InterfaceClases {
    private String nombre;
    private int id;
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String nombre, int id, String especialidad) {
        this.nombre = nombre;
        this.id = id;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    @Override
    public void Leer() {

    }

    @Override
    public void RealizarEjercicios() {

    }
}
