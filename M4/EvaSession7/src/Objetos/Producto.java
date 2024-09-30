package Objetos;

import Interfaces.ProductoInterface;

public abstract class Producto implements ProductoInterface {
    protected int precio;
    protected int cantidad;

    public Producto() {
    }

    public Producto( int precio, int cantidad) {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void cambiarPrecio(int nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El precio ha sido actualizado a: " + nuevoPrecio);
    }

    @Override
    public void cantidadDisponible() {
        System.out.println("Cantidad disponible: " + this.cantidad);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}