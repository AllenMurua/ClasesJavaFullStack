import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean entrada = false;
        Scanner input = new Scanner(System.in);
        while (!entrada){
            System.out.println("escoja la tarea 1 o 2");
            int ingreso = input.nextInt();
            if (ingreso==1){
                ejercicio1.main(null);
                entrada = true;
            }else if (ingreso==2){
                Ejercicio2.main(null);
                entrada = true;
            }
        };
    }
}