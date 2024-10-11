import Objects.DirectorTecnico;
import Objects.Futbolista;
import Objects.Personas;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Personas> seleccion =registro();
        System.out.println("Selección de Fútbol completa:");
        for (Personas persona : seleccion) {
            System.out.println(persona);
        }

        // Demostrar algunas acciones
        System.out.println("\nDemostración de acciones:");
        if (!seleccion.isEmpty()) {
            Personas ultimaPersona = seleccion.get(seleccion.size() - 1);
            if (ultimaPersona instanceof DirectorTecnico) {
                DirectorTecnico dt = (DirectorTecnico) ultimaPersona;
                System.out.println("Acción del Director Técnico:");
                dt.Hablar();
            }
        }

    }
    public static ArrayList<Personas> registro(){
        ArrayList<Objects.Personas> personas = new ArrayList<>();
        personas.add(new Futbolista(1,"delantero Izquierdo",(new Objects.Personas("Jamal","Lamine",18))));
        personas.add(new Futbolista(2,"delantero Derecho",(new Objects.Personas("Jamal","Lamine",22))));
        personas.add(new Futbolista(3,"Central",(new Objects.Personas("Jamal","Lamine",34))));
        personas.add(new Futbolista(4,"Central Derecha",(new Objects.Personas("Jamal","Lamine",23))));
        personas.add(new Futbolista(5,"Central izquierda",(new Objects.Personas("Jamal","Lamine",43))));
        personas.add(new Futbolista(6,"Central Soporte",(new Objects.Personas("Jamal","Lamine",32))));
        personas.add(new Futbolista(7,"Defensa",(new Objects.Personas("Jamal","Lamine",31))));
        personas.add(new Futbolista(8,"Defensa Izquierda",(new Objects.Personas("Jamal","Lamine",28))));
        personas.add(new Futbolista(9,"Defensa Derecha",(new Objects.Personas("Jamal","Lamine",29))));
        personas.add(new Futbolista(10,"delantero Central",(new Objects.Personas("Jamal","Lamine",25))));
        personas.add(new Futbolista(11,"Arquero",(new Objects.Personas("Jamal","Lamine",1))));
        personas.add(new DirectorTecnico(12,"Michael","jordam",67));

        System.out.println("Selección de Fútbol:");
        for (Objects.Personas persona : personas) {
            System.out.println(persona);
        }
        return personas;
    }

}