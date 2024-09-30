import java.util.Scanner;

public class CalculadoraImc {

    public static void Calculadora() {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese su Peso en KG: ");
        double peso = datos.nextDouble();
        System.out.println("Ingrese su Altura en mt: ");
        double altura = datos.nextDouble();
        double imc = peso /altura;
        System.out.println("Calculando su IMC..");

        System.out.println("Su indice de masa muscular es: " + imc);

    }

}
