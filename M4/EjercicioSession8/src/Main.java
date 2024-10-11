import Objetos.Alumno;
import Objetos.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Profesor> Curso= new ArrayList<>();
        Curso.add(new Profesor("Karina Nuñez", 123123, "Ciencias"));

        Profesor profe = Curso.getFirst();

         Curso.add(new Alumno("Javier MAnzano",12,"Futbol",profe));
         Curso.add(new Alumno("Juan Jose",13,"Lectura",profe));
         Curso.add(new Alumno("Pepe Grillo",14,"Titeretero", profe));


        System.out.println("El curso esta compuesto por: ");
        for (Profesor profesor : Curso) {
            System.out.println(profesor.toString());
        }



    }
}