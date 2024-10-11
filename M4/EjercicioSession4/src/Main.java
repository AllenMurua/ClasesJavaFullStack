import Objetos.Persona;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Persona> Personas = new ArrayList<>();
        Persona p = new Persona("juan perez",18, 80,1.90 );
        Personas = personas();
        Personas.add(p);

        for (Persona persona: Personas){
            System.out.println(p.getNombre()+ ":");

            System.out.println("Calculando su IMC....");
            System.out.println(persona.getNombre() + "/" + persona.getEdad()+ "/" + persona.getAltura() + "/" + persona.getPeso() );
            calcularIMC(persona.getPeso(), p.getAltura(), persona.getEdad());
            System.out.println("------------------------------");

        }
    }
    public static List<Persona> personas (){
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add( new Persona("juan perez",33, 80,1.7));
        listaPersonas.add(new Persona("Jose Sanchez",88, 50,1.30));
        listaPersonas.add(new Persona("Jaime Perejil",41, 120,1.80));
        listaPersonas.add(new Persona("Alexandra Cuarela",12, 40,1.20));
        listaPersonas.add(new Persona("Geronimo Arias",22, 70,1.70));
        return listaPersonas;
    }

    public static void calcularIMC(int peso, double altura, int edad){
        double imc = peso/(altura*altura);
        System.out.println("Su indice de masa muscular es: " + imc);
        if (imc < 18.5){
            System.out.println("Usted se encuentra bajo peso");
        } else if (imc < 24.9) {
            System.out.println("Usted se encuentra peso normal");
        }else if (imc < 29.9) {
            System.out.println("Usted se encuentra sobrepeso");
        }else {
            System.out.println("Usted se encuentra obesidad");
        }
        System.out.println("Su edad es: " + edad);
        if (edad<18){
            System.out.println("Usted es menor de edad");
        }else {
            System.out.println("Usted es mayor de edad");
        }
    }
}