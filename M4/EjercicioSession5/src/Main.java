import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] asignaturas = new String[5];
        double[] notas = new double[5];
        double notaFinal = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de la asignatura " + (i + 1) + ": ");
            asignaturas[i] = sc.nextLine();

            while (true) {
                System.out.println("Ingrese la nota de la asignatura: ");
                if (sc.hasNextDouble()) {
                    notas[i] = sc.nextDouble();
                    notaFinal += notas[i];
                    sc.nextLine();
                    break;
                } else {
                    System.out.println("Por favor ingrese un número válido!");
                    sc.next(); // consume the invalid input
                }
            }
        }
        System.out.println("Sus notas son las siguientes:");
        for(int i = 0; i < 5; i++) {
            System.out.println(asignaturas[i] + "= " + notas[i]);
        }
        System.out.println("El promedio final del alumno es: " + notaFinal / 5  );
    }
}