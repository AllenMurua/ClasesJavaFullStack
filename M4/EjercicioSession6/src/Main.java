import Modelo.Usuario;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Usuario usu = new Usuario("Allen01","Cochallullo");
        do {
            System.out.println("Ingrese nombre de usuario");
            String nombre = sc.nextLine();
            System.out.println("Ingrese Contraseña");
            String contra = sc.nextLine();
            if (nombre.equals(usu.getNombre()) && contra.equals(usu.getContrasena())){
                System.out.println("Bienvenido" + usu.getNombre());
                System.out.println("Que desea hacer?");
                System.out.println("1. Calcular raíz cuadrada");
                System.out.println("2. Ver el valor de pi");
                System.out.println("3. Calcular la potencia de un numero");
                int opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el numero");
                        double numero = sc.nextDouble();
                        System.out.println("El resultado es: " + Math.sqrt(numero));
                        return;
                    case 2:
                        System.out.println("El valor de pi es: " + Math.PI);
                        return;
                    case 3:
                        System.out.println("Ingrese el numero");
                        double numero2 = sc.nextDouble();
                        System.out.println("Ingrese el exponente");
                        double exponente = sc.nextDouble();
                        System.out.println("El resultado es: " + Math.pow(numero2,exponente));
                }       return;
            }else {
                System.out.println("Credenciales incorrectas");

            }
        }while(true);
    }
}