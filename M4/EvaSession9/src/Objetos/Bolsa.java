package Objetos;

import java.util.ArrayList;

public class Bolsa<T>  extends Producto{
    private ArrayList<Producto<T>> items;
    private int capacidad;
    public Bolsa(int capacidad) {
        this.items = new ArrayList<>();
        this.capacidad = capacidad;
    }

    public ArrayList<Producto<T>> getProductos() {
        return items;
    }

    public void setProductos(ArrayList<Producto<T>> productos) {
        this.items = productos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void agregar(T item) {
        if (items.size() < capacidad) {
            items.add(new Producto<>(item));
        } else {
            System.out.println("La bolsa está llena.");
        }
    }

    public void mostrarContenido() {
        for (Producto<T> producto : items) {
            System.out.println(producto);
        }
    }
}
