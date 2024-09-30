package Objects;
import Instancias.Pago;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Admin extends Pelicula implements Pago {
    ArrayList<Pelicula> peliculas = new ArrayList();
    Pelicula pelicula;
    private String name;
    private String password;
    private String email;
    private int dinero;


    public Admin(String name, String password, String email, int dinero) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.dinero = dinero;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dinero=" + dinero +
                '}';
    }
    public ArrayList<Pelicula> showAvailableMovies() {
        ArrayList<Pelicula> availableMovies = new ArrayList<>();
        for (Pelicula pelicula : getPeliculas()) {
            if (pelicula.isDisponibilidad()) {
                availableMovies.add(pelicula);
            }
        }
        return availableMovies;
    }

    @Override
    public void pagar(int costo, String nombre, int dinero) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pelicula> availableMovies = new ArrayList<>();
        for (Pelicula pelicula : availableMovies) {
            if (pelicula.isDisponibilidad()) {
                System.out.println("Pago Admin");
                System.out.println("Con que medio desea pagar?");
                System.out.println("1.- Debito");
                System.out.println("2.- Efectivo");
                int option = Integer.parseInt(sc.nextLine());
                if (option == 1) {
                    System.out.println("Se ha realizado el pago con exito");
                    dinero = dinero+ costo;
                }else if(option == 2){
                    System.out.println("Ingrese la cantidad de Efectivo");
                    int efectivo = Integer.parseInt(sc.nextLine());
                    System.out.println("Vuelto = " + (efectivo-costo));
                    dinero = dinero+ costo;
                }
            }else {
                System.out.println("Pelicula No disponible");
                return;
            }
        }

    }

    @Override
    public Boolean InicioSession(String contra) {
        return this.password.equals(contra);
    }
}
