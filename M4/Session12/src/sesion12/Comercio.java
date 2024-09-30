package sesion12;

import java.util.ArrayList;
import java.util.List;

public class Comercio {
    private List<Producto> listaProductos;

    public Comercio() {
        this.listaProductos = new ArrayList<>();
        inicializarProductos();
    }

    private void inicializarProductos() {
        listaProductos.add(new Producto("Camiseta de fútbol", 59.99, "Ropa deportiva"));
        listaProductos.add(new Producto("Balón de fútbol", 29.99, "Equipamiento"));
        listaProductos.add(new Producto("Botines de fútbol", 89.99, "Calzado"));
        listaProductos.add(new Producto("Medias de fútbol", 12.99, "Ropa deportiva"));
        listaProductos.add(new Producto("Guantes de portero", 34.99, "Equipamiento"));
        listaProductos.add(new Producto("Espinilleras", 19.99, "Protección"));
        listaProductos.add(new Producto("Cono de entrenamiento", 5.99, "Entrenamiento"));
        listaProductos.add(new Producto("Pito de árbitro", 9.99, "Arbitraje"));
        listaProductos.add(new Producto("Bolso deportivo", 39.99, "Accesorios"));
        listaProductos.add(new Producto("Banda de capitán", 7.99, "Accesorios"));
    }

    public void mostrarProductos() {
        System.out.println("Lista de Productos:");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    // Clase interna para representar un producto individual
    private class Producto {
        private String nombre;
        private double precio;
        private String categoria;

        public Producto(String nombre, double precio, String categoria) {
            this.nombre = nombre;
            this.precio = precio;
            this.categoria = categoria;
        }

        @Override
        public String toString() {
            return "Producto{" +
                    "nombre='" + nombre + '\'' +
                    ", precio=" + precio +
                    ", categoria='" + categoria + '\'' +
                    '}';
        }
    }
}