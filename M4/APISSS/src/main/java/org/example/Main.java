package org.example;


import java.util.List;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.modelo.Publicacion;


public class Main {
        public static void main(String[] args) {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts");
            Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

            Response respuestaPublicaciones = invocationBuilder.get();

            // Define a generic type for List<Publicacion>
            GenericType<List<Publicacion>> genericType = new GenericType<List<Publicacion>>() {};

            List<Publicacion> listaPublicaciones = respuestaPublicaciones.readEntity(genericType);
            System.out.println(listaPublicaciones.get(0));

            String JsonSerializer = respuestaPublicaciones.readEntity(String.class);
            System.out.println(JsonSerializer);

    }
}