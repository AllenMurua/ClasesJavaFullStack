import Modelo.Productos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Productos> listaProductos= new ArrayList<>();
        listaProductos.add(new Productos("Chocolate",1000,"Chocolate de Leche, 400gr"));
        listaProductos.add(new Productos("Leche",800,"Leche Entera, 1 litro"));
        listaProductos.add(new Productos("Arroz",900,"Arroz grado 2, 1 Kilo"));
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1. Ver Productos");
            System.out.println("2. Agregar Producto");
            System.out.println("3. MOdificar Producto");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    for (Productos producto : listaProductos) {
                        System.out.println("Producto: " + producto);
                    }
                    System.out.println("--------------------------");
                    break;
                case 2:
                    if (listaProductos.size() <= 10){
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = sc.next();
                        System.out.println("Ingrese el precio del producto: ");
                        int precio = sc.nextInt();
                        System.out.println("Ingrese la descripcion del producto: ");
                        String descripcion = sc.next();
                        Productos producto = new Productos(nombre,precio,descripcion);
                        listaProductos.add(producto);
                        for (Productos producto1 : listaProductos) {
                            if (producto1.getNombre().equals(nombre)){
                                System.out.println("Hubo un error al agregar el producto");
                            }else {
                                System.out.println("Se agrego el producto: " + producto1 + "Correctamente");
                            }
                        }
                        break;
                    }else {
                        System.out.println("No se pueden ingresar mas productos");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto a modificar: ");
                    String nombre = sc.next();
                    for (Productos producto : listaProductos) {
                        if (producto.getNombre().equals(nombre)){
                            System.out.println(producto.getNombre());
                            System.out.println("Que dato desea modificar?");
                            System.out.println("1. Nombre");
                            System.out.println("2. Precio");
                            System.out.println("3. Descripcion");
                            int opcionModificar = sc.nextInt();
                            switch (opcionModificar){
                                case 1:
                                    System.out.println("Ingrese el nuevo nombre: ");
                                    String nuevoNombre = sc.next();
                                    producto.setNombre(nuevoNombre);
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nuevo precio: ");
                                    int nuevoPrecio = sc.nextInt();
                                    producto.setPrecio(nuevoPrecio);
                                    break;
                                case 3:
                                    System.out.println("Ingrese la nueva descripcion: ");
                                    String nuevaDescripcion = sc.next();
                                    producto.setDescripcion(nuevaDescripcion);
                                    break;

                            }
                        }
                    }
                    break;
                case 4:

                    return;
            }
        }while (true);
    }
}