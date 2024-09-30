package sesion12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class ManipularArchivo {

    private  String path;
    private  String file;
    private List<?> resourses;

    public ManipularArchivo(String path, String file, List<Object> resourses) {
        this.path = path;
        this.file = file;
        this.resourses = resourses;

    }
    public ManipularArchivo(){

    }
    public void escribirArchivo( String path, String file, List<Object> resourses ) {
        String rutaArchivo = path + file;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {

            for (Object object :resourses) {
                String linea;
                linea = object.toString();
                bw.write(linea);
                bw.newLine();

            }

        }catch (Exception e) {
            System.out.println("Error al escribir el archivo"+e.getMessage());
        }
    }


}
