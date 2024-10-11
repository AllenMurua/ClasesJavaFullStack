import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero para el dibujo:");
        int num = sc.nextInt();
        System.out.println("Patron 1");
        for (int i = 1; i <= num; i++) {
            if (i%2==1){
                System.out.print("*");
            }else {
                System.out.print(".");
            }
        }
        System.out.println("\nPatrón 2 (Cuadrado hueco)");
        for (int i = 1; i <= num; i++) {
            String pat2 = "";
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    pat2 += "*";
                } else {
                    pat2 += " ";
                }
            }
            System.out.println(pat2);
        }
    }
}