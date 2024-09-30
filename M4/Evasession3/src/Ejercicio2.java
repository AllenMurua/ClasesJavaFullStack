import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int ceros = 0, pos = 0, neg = 0;
        for(int i=0; i < 10; i++){
            System.out.print("Ingrese numero entero: ");
            numeros[i]= sc.nextInt();
            if (numeros[i] == 0) {
                ceros++;
            }else if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            }

        }
        System.out.println("El numeros de ceros introducidos es de: " + ceros);
        System.out.println("El numeros de positivos introducidos es de: " + pos);
        System.out.println("El numeros de negativos introducidos es de: " + neg);
    }

}
