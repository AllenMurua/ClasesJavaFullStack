import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = datos.next();

        System.out.println("Ingrese Precio de Producto 1");
        double p1 = datos.nextDouble();
        System.out.println("Ingrese Precio de Producto 2");
        double p2 = datos.nextDouble();
        System.out.println("Ingrese Precio de Producto 3");
        double p3 = datos.nextDouble();
        System.out.println("Ingrese Precio de Producto 4");
        double p4 = datos.nextDouble();
        System.out.println("Ingrese Precio de Producto 5");
        double p5 = datos.nextDouble();
        double sum =p1+p2+p3+p4+p5;

        if (sum<=10000){
            System.out.println(nombre + "Deberas pagar el total de: "+sum + "En efectivo");

        } else if (sum >= 10001 && sum<= 20000){
            System.out.println(nombre + "Deberas pagar el total de: "+sum + "Con tarjeta");

        }else{

            System.out.println(nombre + "Deberas pagar el total de: "+sum + "En cheque");
        }



    }
}