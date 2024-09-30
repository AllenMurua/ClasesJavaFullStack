import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("Porfabor ingrese la temperatura de hoy:");
        int clima = input.nextInt();

        if (clima <= 10){
            System.out.println("hay "+ clima+" grados, el tipo de clima de hoy es Frio");
        } else if (clima > 10 && clima < 20) {
            System.out.println("hay "+ clima+" grados, el tipo de clima de hoy es Nublado");
        }else if (clima > 20 && clima < 30){
            System.out.println("hay "+ clima+" grados, el tipo de clima de hoy es Caluroso");
        }else {
            System.out.println("hay "+ clima+" grados, el tipo de clima de hoy es Tropical");
        }
    }
}
