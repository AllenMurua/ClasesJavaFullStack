import Objetos.Productos;
import Objetos.Vegetales;
import Objetos.Vendedor;
import Objetos.Vestuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        ArrayList<Productos> productos = new ArrayList<>();
        ArrayList<Productos> carrito = new ArrayList<>();

        Vendedor vendedor = new Vendedor("Catalina", "12345678-9");

        productos.add(new Vestuario("XL", "Azul", "Vestido Largo", 120000, 123));
        productos.add(new Vestuario("M", "Morado", "Poleron", 40000, 111));
        productos.add(new Vestuario("S", "Negro", "Crop Top", 15000, 112));
        productos.add(new Vestuario("45", "Negro", "Pantalon Straight", 30000, 113));
        productos.add(new Vestuario("50", "Azul", "Skiny Jeans", 30000, 114));
        productos.add(new Vegetales("Choclo", 3000, 12, "12/03/2022", "13/04/2022"));
        productos.add(new Vegetales("Lechuga", 1000, 13, "12/03/2022", "13/04/2022"));
        productos.add(new Vegetales("Zanahoria", 800, 14, "12/03/2022", "13/04/2022"));

        for (Productos p : productos) {
            System.out.println(p.toString());
        }
        System.out.println("Bienvenido trabajador ingrese sus Credenciales:");
        while (true){
            System.out.println("Ingrese su nombre:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese su Rut:");
            String rut = sc.nextLine();
            if (nombre.equals(vendedor.getNombre()) && rut.equals(vendedor.getRut())){
                System.out.println("Bienvenido" + vendedor.getNombre());
                System.out.println("Que desea hacer?");
                System.out.println("1. Ver productos");
                System.out.println("2. Comprar");
                System.out.println("3. Ver Carrito de Compras");
                System.out.println("4. Pagar");
                System.out.println("5. Salir");
                switch (sc.nextInt()){
                    case 1:
                        for (Productos p : productos) {
                            System.out.println(p.toString());
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el codigo del producto que desea comprar:");
                        String codigo = sc.nextLine();
                        for (Productos p : productos) {
                            if (codigo.equals(p.getCodigo())){
                                carrito.add(p);
                                System.out.println(p.getNombre() + "Se ha añadido al carrito");
                            }
                        }
                        break;
                    case 3:
                        for (Productos p : carrito) {
                            System.out.println(p.toString());
                        }
                        break;
                    case 4:
                        System.out.println("Su boleta es la siguiente: ");
                        int total = 0;
                        for (Productos p : carrito) {
                            System.out.println(p.getNombre() + " / " + p.getPrecio());
                            total += p.getPrecio();
                        }
                        System.out.println("El total de su compra es: " + total);

                    case 5:
                        return;
                }
            }
        }


    }
}