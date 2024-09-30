package sesion12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturadeArchivos {
    public void lectura() {
        String rutaRaiz = System.getProperty("user.home");
        System.out.println(rutaRaiz);
        //String directorio = "src/sesion12/";
        //String fichero ="archivo";
        String directirioDocker = "/Desktop/";
        String RutaCompuesta = rutaRaiz + directirioDocker;
        String file = "Dockerfile";
        System.out.println(RutaCompuesta + file);
        String rutArchivo =RutaCompuesta + file;





        try(BufferedReader br = new BufferedReader(new FileReader(rutArchivo ))){
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
