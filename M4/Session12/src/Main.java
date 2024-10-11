import sesion12.Comercio;
import sesion12.LecturadeArchivos;
import sesion12.ManipularArchivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String rutaRaiz = System.getProperty("user.home");

        String directirioDocker = "/Desktop/";
        String RutaCompuesta = rutaRaiz + directirioDocker;
        String file = "Dockerfile";
        System.out.println(RutaCompuesta + file);
        String rutArchivo =RutaCompuesta + file;

        LecturadeArchivos lectura = new LecturadeArchivos();
        lectura.lectura();

        Comercio comercio = new Comercio();
        comercio.mostrarProductos();

        ManipularArchivo manipularArchivo = new ManipularArchivo();
//        manipularArchivo.escribirArchivo(comercio.getListaProductos());


    }
}