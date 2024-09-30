package Objetos;

import Instancias.InterfaceClases;

public class Alumno extends Profesor implements InterfaceClases {
    private String nombre;
    private int id;
    private String hobby;
    private Profesor profesor;

    public Alumno() {}

    public Alumno(String nombre, int id, String hobby, Profesor profesor) {
        this.nombre = nombre;
        this.id = id;
        this.hobby = hobby;
        this.profesor = profesor;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", hobby='" + hobby + '\'' +
                ", profesor=" + profesor +
                '}';
    }

    @Override
    public void Leer() {

    }

    @Override
    public void RealizarEjercicios() {

    }
}
