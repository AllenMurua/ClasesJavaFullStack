package Objetos;

public class Poleras{
    private String color;

    public Poleras() {}

    public Poleras(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;

    }
    public void setColor(String color) {
        this.color = color;

    }
    @Override
    public String toString() {
        return "Poleras{" +
                "color='" + color + '}';
    }
}
