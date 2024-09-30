package org.example.modelo;

public class Publicacion {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;

    public Publicacion(Integer userId, Integer id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String toJson() {
        return "{\n" +
                "    \"userId\": " + userId + ",\n" +
                "    \"id\": " + id + ",\n" +
                "    \"title\": \"" + escapeJsonString(title) + "\",\n" +
                "    \"body\": \"" + escapeJsonString(body) + "\"\n" +
                "}";
    }

    private String escapeJsonString(String input) {
        if (input == null) {
            return "";
        }
        return input.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
