import Objects.Alumnos;
import Objects.Profesors;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Profesors> clase = new ArrayList<>();
        clase.add(new Profesors("Javier Peñicles", "02/Julio/1980"));
        clase.add(new Alumnos("Jaime","20/04/2001","Matematicas"));
        clase.add(new Alumnos("Catalina","25/05/2001","Matematicas"));
        clase.add(new Alumnos("Waleska","16/04/2002","Historia"));
        clase.add(new Alumnos("Augusto","7/10/2001","Ciencias"));
        clase.add(new Alumnos("Felipe","19/12/2001","Matematicas"));

        for (Profesors c : clase){
            System.out.println(c.getClass() + " - " + c.getNombre());
        }
    }
}