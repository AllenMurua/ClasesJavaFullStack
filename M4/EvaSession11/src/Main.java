import Objects.Admin;
import Objects.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Pelicula> peliculas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Admin admin = new Admin("adminName", "adminPassword", "admin@example.com", 1000);
        inicializarPeliculas();
        System.out.println("Inicie Sesion:");
        System.out.print("Usuario: ");
        String usu = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (admin.InicioSession(pass)) {
            System.out.println("Bienvenido a Video Club Nostalgia");
            while (true) {
                System.out.println("\nBienvenido a Video Club Nostalgia Francisco Puentes");
                System.out.println("Seleccione la opción que desea:");
                System.out.println("1.- Ver lista de películas");
                System.out.println("2.- Ver lista de películas disponibles");
                System.out.println("3.- Arrendar una película");
                System.out.println("4.- Devolver una película");
                System.out.println("5.- Cerrar programa");

                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        mostrarTodasLasPeliculas();
                        break;
                    case 2:
                        mostrarPeliculasDisponibles();
                        break;
                    case 3:
                        arrendarPelicula();
                        break;
                    case 4:
                        devolverPelicula();
                        break;
                    case 5:
                        System.out.println("Gracias por usar Video Club Nostalgia. ¡Hasta pronto!");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            }
        } else {
            System.out.println("Inicio de sesión fallido. Por favor, intente nuevamente.");
        }

        sc.close();
    }
    private static void inicializarPeliculas() {
        peliculas.add(new Pelicula("La Lista de Schindler", "Thomas Keneally", "Drama histórico", "Steven Spielberg", 5, true));
        peliculas.add(new Pelicula("El Padrino", "Mario Puzo", "Drama", "Francis Ford Coppola", 99, true));
        peliculas.add(new Pelicula("El Señor de los Anillos: La Comunidad del Anillo", "J.R.R. Tolkien", "Fantasía", "Peter Jackson", 119, false));
        peliculas.add(new Pelicula("Matrix", "Las Wachowski", "Ciencia Ficción", "Las Wachowski", 136, true));
        peliculas.add(new Pelicula("Pulp Fiction", "Quentin Tarantino", "Crimen", "Quentin Tarantino", 154, false));
        peliculas.add(new Pelicula("El Laberinto del Fauno", "Guillermo del Toro", "Fantasía", "Guillermo del Toro", 118, true));
        peliculas.add(new Pelicula("El Club de la Pelea", "Chuck Palahniuk", "Drama", "David Fincher", 139, false));
        peliculas.add(new Pelicula("Interstellar", "Jonathan Nolan", "Ciencia Ficción", "Christopher Nolan", 169, true));
        peliculas.add(new Pelicula("Parasite", "Bong Joon-ho", "Thriller", "Bong Joon-ho", 132, false));
        peliculas.add(new Pelicula("La La Land", "Damien Chazelle", "Musical", "Damien Chazelle", 128, true));
        peliculas.add(new Pelicula("El Pianista", "Roman Polanski", "Drama", "Roman Polanski", 150, false));

    }
    private static void mostrarTodasLasPeliculas() {
        System.out.println("\nLista de todas las películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo()+" / " + pelicula.getGenero() + " / " + pelicula.getPrecio());
        }
    }

    private static void mostrarPeliculasDisponibles() {
        System.out.println("\nLista de películas disponibles:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.isDisponibilidad()) {
                System.out.println(pelicula.getTitulo()+" / "+pelicula.getGenero() + " / " + pelicula.getPrecio());
            }
        }
    }

    private static void arrendarPelicula() {
        System.out.print("\nIngrese nombre de la película que desea arrendar: ");
        String titulo = sc.nextLine();

        Pelicula peliculaSeleccionada = null;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo) && pelicula.isDisponibilidad()) {
                peliculaSeleccionada = pelicula;
                break;
            }
        }

        if (peliculaSeleccionada == null) {
            System.out.println("La película no está disponible o no existe.");
            return;
        }

        System.out.println("Seleccione Medio de pago");
        System.out.println("1.- Debito");
        System.out.println("2.- Efectivo");

        int opcionPago = Integer.parseInt(sc.nextLine());

        switch (opcionPago) {
            case 1:
                System.out.println("Realizando pago con débito...");
                break;
            case 2:
                System.out.println("Realizando pago en efectivo...");
                break;
            default:
                System.out.println("Opción de pago no válida. Operación cancelada.");
                return;
        }

        peliculaSeleccionada.setDisponibilidad(false);
        System.out.println("Título: " + peliculaSeleccionada.getTitulo() + " ha sido arrendado exitosamente");
        System.out.println("Realízate el pago en " + (opcionPago == 1 ? "débito" : "efectivo"));
    }

    private static void devolverPelicula() {
        System.out.print("\nIngrese nombre de la película que desea devolver: ");
        String titulo = sc.nextLine();

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo) && !pelicula.isDisponibilidad()) {
                pelicula.setDisponibilidad(true);
                System.out.println("La película '" + pelicula.getTitulo() + "' ha sido devuelta exitosamente.");
                return;
            }
        }

        System.out.println("No se encontró la película o ya estaba disponible.");
    }
}