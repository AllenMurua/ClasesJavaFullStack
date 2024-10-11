import Objetos.Cocina;
import Objetos.Refrigerador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Refrigerador> refrigeradors = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Cocina cocina = new Cocina(4,44000,12);

        refrigeradors.add(new Refrigerador("A",2,40000,20));
        refrigeradors.add(new Refrigerador("B",2,35000,12));
        refrigeradors.add(new Refrigerador("C",2,35000,5));
        refrigeradors.add(new Refrigerador("D",2,1000000,7));
        refrigeradors.add(new Refrigerador("E",2,123123,2));

        System.out.println("Seleccione Tipo de usuario");
        System.out.println("1. Comprador");
        System.out.println("2. Administrador");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Seleccione el producto que desea comprar:");
                System.out.println("1. Refrigerador");
                System.out.println("2. Cocina");
                int opcion2 = sc.nextInt();
                switch (opcion2){
                    case 1:
                        System.out.println("Que tipo de Refrigerador desea comprar?");
                        System.out.println("1. A");
                        System.out.println("2. B");
                        System.out.println("3. C");
                        System.out.println("4. D");
                        System.out.println("5. E");
                        String opcion3 = sc.nextLine();
                        for(Refrigerador refrigerador : refrigeradors){
                            if (opcion3.equals(refrigerador.getGastoElectrico())){
                                System.out.println("Valor: " + refrigerador.getPrecio());
                                System.out.println("Desea comprar? (S/N)");
                                String respuesta = sc.next();
                                if(respuesta.equals("S")){
                                    refrigerador.setCantidad(refrigerador.getCantidad() - 1);
                                    System.out.println("Felicidades ha comprado un Refrigerador que su gasto de energia es tipo A");
                                    System.out.println("Nueva Cantidad de Articulos:" + refrigerador.getCantidad());
                                }
                            }

                        }
                        break;
                    case 2:
                        System.out.println("Valor: " + cocina.getPrecio());
                        System.out.println("Cuenta con " + cocina.getCantidad() + " calentadores");
                        System.out.println("Desea comprar? (S/N)");
                        String respuesta = sc.next();
                        if(respuesta.equals("S")){
                            System.out.println("Desea agregar un gas por 5000 pesos (S/N)");
                            if (sc.next().equals("S")){
                                Cocina.IncluyeGas();
                            }else {
                                System.out.println("Felicidades Ha comprado su cocina");
                            }
                            cocina.setCantidad(cocina.getCantidad() - 1);
                            System.out.println("Nueva Cantidad de Articulos:" + cocina.getCantidad());
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;

                }
            case 2:
                System.out.println("Seleccione la accion que desea realizar:");
                System.out.println("1. Cambiar precio");
                System.out.println("2. Cantidad de articulos");
                opcion2 = sc.nextInt();
                switch (opcion2){
                    case 1:
                        System.out.println("A que articulo desea cambiar el precio?");
                        System.out.println("1. Refrigerador");
                        System.out.println("2. Cocina");
                        int opcion3 = sc.nextInt();
                        switch (opcion3){
                            case 1:
                                System.out.println("Que tipo de Refrigerador desea Cambiar el precio?");
                                System.out.println("1. A");
                                System.out.println("2. B");
                                System.out.println("3. C");
                                System.out.println("4. D");
                                System.out.println("5. E");
                                String opcion4 = sc.nextLine();

                                for(Refrigerador refrigerador : refrigeradors){
                                    if (opcion4.equals(refrigerador.getGastoElectrico())){
                                        refrigerador.cambiarPrecio(sc.nextInt());
                                        System.out.println("Nuevo precio: " + refrigerador.getPrecio());
                                    }
                                }
                                break;
                            case 2:
                                cocina.cambiarPrecio(sc.nextInt());
                                System.out.println("Nuevo precio: " + cocina.getPrecio());}
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;

                    case 2:
                        System.out.println("Articulos disponibles:");
                        System.out.println("1. Refrigerador");
                        for (Refrigerador refrigerador : refrigeradors){
                            System.out.println("Tipo: " + refrigerador.getGastoElectrico() + " // " + refrigerador.getCantidad());
                        }
                        System.out.println("2. Cocina");
                        System.out.println("Tipo: " + cocina.getCantCalentadores() + " calentadores" + " // " + cocina.getCantidad());
                }

        }

    }
}
