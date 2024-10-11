import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Set<String> numeros = new HashSet<String>();
    public static void main(String[] args) {
        System.out.println("Ingrese Numeros aleatorios");
        LeerNumeros();


    }
    public static void LeerNumeros() {
        while (true) {
            System.out.println("Ingrese el primer numero: ");
            int num = sc.nextInt();
            if (num == -99){
                break;
            }else {
                numeros.add(String.valueOf(num));
            }

        }
    }

    public static void CalcularSuma(){

    }

    public static void MostrarResultados() {

    }
}