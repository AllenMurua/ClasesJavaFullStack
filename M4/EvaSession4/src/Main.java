import Modelo.Auto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int estadoAuto = 0;
        int opcion;
        double velocidad = 0;
        Auto a1= new Auto("Mercedes","Sub", "Blanco", 180);

        do {
            System.out.println("Seleccione accion del auto " + a1.getMarca() + " " + a1.getModelo());
            System.out.println("1. Encender auto");
            System.out.println("2. Apagar auto");
            System.out.println("3. Acelerar auto");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    estadoAuto = 1;
                    break;
                case 2:
                    estadoAuto = 0;
                    velocidad =0;
                    break;
                case 3:
                    if (estadoAuto == 0){
                        System.out.println("El auto no esta encendido");

                    }else{
                        if (estadoAuto<4){
                            velocidad = Acelerar(estadoAuto, a1);
                            estadoAuto++;

                        }else{
                            System.out.println("Exede Maximo de velocidad");
                        }

                    }

            }
            System.out.println("Estado del auto: " + estadoAuto);
            System.out.println("Velocidad del auto: " + velocidad);
        }while (opcion != 4);

    }
    public static double Acelerar(int estadoAuto, Auto a1){

        int velMax = a1.getVelocidadMaxima();
        double velocidad = 0;
        switch (estadoAuto){
            case 1:
                estadoAuto++;
                velocidad = velMax * 0.2;
                break;
            case 2:
                estadoAuto++;
                velocidad = velMax * 0.4;
                break;
            case 3:
                estadoAuto++;
                velocidad = velMax * 0.6;
            case 4:
                estadoAuto++;
                velocidad = velMax * 0.8;
                break;
            case 5:
                estadoAuto++;
                velocidad = velMax;
                break;

            default:
                velocidad = velMax;
        }

        return velocidad;
    }
}