import Interfaces.InterfazVehiculo;
import Modelo.Auto;
import Modelo.Bicicleta;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenas tardes, con que tipo de vehiculo llega a esta bencinera?");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                Auto a1= new Auto();
                System.out.println("Llego un Auto");
                System.out.println("Registre su auto");
                System.out.println("Cantidad de ventanas:");
                int ventanas = sc.nextInt();
                a1.setCantVentanas(ventanas);
                System.out.println("Ingrese Modelo:");
                a1.setModelo(sc.next());
                System.out.println("Ingrese Color:");
                a1.setColor(sc.next());
                a1.setNumeroRuedas(4);
                System.out.println("Auto registrado..");
                System.out.println("Que bencina desea cargar?");
                a1.InterfazVehiculo();
                break;
            case 2:
                System.out.println("Llego una bicicleta");
                System.out.println("Ingrese el tipo de la bicicleta:");
                String tipo = sc.next();
                Bicicleta b1 = new Bicicleta();
                b1.setTipoBicicleta(tipo);
                b1.setCantVentanas(0);
                b1.setCantVentanas(0);
                System.out.println("Bicicleta registrada");
                System.out.println("La zona de aires esta al fondo a la derecha");
                break;
            default:
                System.out.println("No viene con vehiculo salga porfa");
                break;

        }
    }
}