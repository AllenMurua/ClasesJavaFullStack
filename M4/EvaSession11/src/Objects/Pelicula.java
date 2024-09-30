package Objects;

import Instancias.Pelis;

import java.io.Serializable;
import java.util.ArrayList;

public class Pelicula implements Pelis {
    private String titulo;
    private String autor;
    private String genero;
    private String director;
    private int precio;
    private boolean disponibilidad;

    public Pelicula() {}

    public Pelicula(String titulo, String autor, String genero, String director, int precio, boolean disponibilidad) {

        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.director = director;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                ", precio=" + precio +
                ", disponibilidad=" + disponibilidad +
                '}';
    }



    @Override
    public void Arrendar() {

    }

    @Override
    public void Devolver() {

    }

    @Override
    public void Listar() {

    }
}
