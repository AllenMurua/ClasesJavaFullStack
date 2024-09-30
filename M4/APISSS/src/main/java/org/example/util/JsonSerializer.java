package org.example.util;

import java.util.List;

public class JsonSerializer {

    public static String toJsonArray(List<org.example.modelo.Publicacion> publicaciones) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < publicaciones.size(); i++) {
            if (i > 0) {
                sb.append(",\n");
            }
            sb.append("    ").append(publicaciones.get(i).toJson().replace("\n", "\n    "));
        }
        sb.append("\n]");
        return sb.toString();
    }
}
