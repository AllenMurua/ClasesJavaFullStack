import Objetos.Bolsa;
import Objetos.Zapatillas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué tipo de productos quieres en la bolsa? (zapatos/poleras)");
        String tipo = sc.nextLine().toLowerCase();

        System.out.println("¿Cuál es el tamaño de la bolsa?");
        int tamano = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        if (tipo.equals("zapatos")) {
            Bolsa<Zapatillas> bolsa = new Bolsa<>(tamano);
            llenarBolsa(sc, bolsa, "zapato");
            bolsa.mostrarContenido();
        } else if (tipo.equals("poleras")) {
            Bolsa<Object> bolsa = new Bolsa<>(tamano);
            llenarBolsa(sc, bolsa, "polera");
            bolsa.mostrarContenido();
        } else {
            System.out.println("Tipo de producto no válido.");
        }

        sc.close();
    }

    private static <T> void llenarBolsa(Scanner sc, Bolsa<T> bolsa, String tipo) {
        while (true) {
            if (tipo.equals("zapato")) {
                System.out.println("Ingrese la marca del zapato (o 'fin' para terminar):");
            } else {
                System.out.println("Ingrese el color de la polera (o 'fin' para terminar):");
            }
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("fin")) break;

            if (tipo.equals("zapato")) {
                bolsa.agregar((T) new Zapatillas(input));
            } else {
                bolsa.agregar((T) new Zapatillas(input));
            }
        }
    }
}
