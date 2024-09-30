import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int pares= 0,impares= 0;
        do {
            System.out.println("Ingrese un numero del 1 al 100");
            int num = sc.nextInt();
                if(num < 100){
                    for (int i = 0; i < num; i++) {
                        if (i % 2 == 0) {
                            pares++;
                        } else {
                            impares++;
                        }
                    }
                    System.out.println("El numero total de pares es: " + pares);
                    System.out.println("El numero total de impares es: " + impares);
                    salir = true;
                }else {
                    System.out.println("------------Error");
                }


        }while(!salir);
        System.out.println("----------Fin del Programa");
    }
}
