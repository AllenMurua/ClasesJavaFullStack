import Modelo.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (usuarios.size() < 10) {
            System.out.println("\nRegistro de nuevo usuario (" + (usuarios.size() + 1) + "/10)");

            System.out.println("Ingrese nombre de usuario: ");
            String nombreUsuario = sc.nextLine();

            String contrasena;
            do {
                System.out.println("Ingrese contraseña (más de 10 caracteres, al menos 2 mayúsculas y 3 números o símbolos): ");
                contrasena = sc.nextLine();
            } while (!validarContrasena(contrasena));

            System.out.println("Ingrese nombre completo: ");
            String nombreCompleto = sc.nextLine();

            String fechaNacimiento;
            do {
                System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy): ");
                fechaNacimiento = sc.nextLine();
            } while (!validarFecha(fechaNacimiento));

            Usuario nuevoUsuario = new Usuario(nombreUsuario, contrasena, nombreCompleto, fechaNacimiento);
            usuarios.add(nuevoUsuario);

            System.out.println("\nUsuario registrado exitosamente.");
            evaluarEdad(nuevoUsuario);
            mostrarUsuariosRegistrados(usuarios);

            if (usuarios.size() < 10) {
                System.out.println("\n¿Desea registrar otro usuario? (S/N)");
                if (!sc.nextLine().equalsIgnoreCase("S")) {
                    break;
                }
            }
        }

        if (usuarios.size() == 10) {
            System.out.println("\nSe ha alcanzado el límite de 10 usuarios.");
        }

        System.out.println("Programa finalizado.");
    }

    public static boolean validarContrasena(String contrasena) {
        if (contrasena.length() <= 10) {
            System.out.println("La contraseña debe tener más de 10 caracteres.");
            return false;
        }

        int contMayus = 0;
        int contNumerosSimbolos = 0;

        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                contMayus++;
            } else if (!Character.isLetter(c)) {
                contNumerosSimbolos++;
            }
        }

        if (contMayus < 2 || contNumerosSimbolos < 3) {
            System.out.println("La contraseña debe tener al menos 2 mayúsculas y 3 números o símbolos.");
            return false;
        }

        return true;
    }

    public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(fecha);
            return true;
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Use dd/MM/yyyy.");
            return false;
        }
    }

    public static void evaluarEdad(Usuario persona) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaNacimiento = sdf.parse(persona.getFechaNacimiento());
            Calendar cal = Calendar.getInstance();
            cal.setTime(fechaNacimiento);
            int yearNacimiento = cal.get(Calendar.YEAR);
            int yearActual = Calendar.getInstance().get(Calendar.YEAR);

            if (yearActual - yearNacimiento >= 18) {
                System.out.println(persona.getNombreUsuario() + " es mayor de edad.");
            } else {
                System.out.println(persona.getNombreUsuario() + " es menor de edad.");
            }
        } catch (ParseException e) {
            System.out.println("Error al evaluar la edad.");
        }
    }

    public static void mostrarUsuariosRegistrados(List<Usuario> usuarios) {
        System.out.println("\nUsuarios registrados:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + ". " + usuarios.get(i));
        }
    }
}