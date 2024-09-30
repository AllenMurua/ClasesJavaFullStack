import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 1000;
        boolean salida = false;
        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1. Depositar dinero a mi cuenta");
            System.out.println("2. Retirar dinero de mi cuenta");
            System.out.println("3. Salir");
            int opcion = input.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el monto a depositar");
                    int monto = input.nextInt();
                    saldo = saldo + monto;
                    System.out.println("Saldo actual :" + saldo);
                    break;
                case 2:
                    System.out.println("Su saldo actual es:" + saldo);
                    System.out.println("Ingrese el monto a retirar");
                    int monto2 = input.nextInt();
                    saldo = saldo - monto2;
                    System.out.println("Saldo actual :" + saldo);
                    break;
                case 3:
                    salida = true;
                    break;


            };
        }while (!salida);

    }
}
