import java.util.Scanner;

public class Ejercicios {
    public static void ListaCompras() {
        double cocina = 299990;
        double lavadora = 234540;
        double comedor = 159990;
        double Televisor = 345100;
        double tasaCambio = 913.24;
        double iva =  0.19*(cocina+lavadora+comedor+Televisor);

        System.out.println("El total de su compra es: "+(cocina + lavadora + comedor + Televisor));
        System.out.println("El IVA es: "+(iva));
        System.out.println("El total mas IVA es: "+( iva + (cocina + lavadora + comedor + Televisor)));
        System.out.println("El total de su compra en dolares es: "+((cocina + lavadora + comedor + Televisor)/tasaCambio));

    }
}
