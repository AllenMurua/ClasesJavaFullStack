import java.util.Scanner;

public class ejkerccicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String apellido="";

        System.out.println("INTRODUZCA LA ALTURA DEL RECTANGULO:");
        int altura = input.nextInt();
        System.out.println("INTRODUZCA EL ANCHO DEL RECTANGULO:");
        int base = input.nextInt();


        System.out.println("El area del rectuangulo es: "+(altura*base));
        System.out.println("El perimetro del rectuangulo es: "+(2*(altura*base)));




    }
}
