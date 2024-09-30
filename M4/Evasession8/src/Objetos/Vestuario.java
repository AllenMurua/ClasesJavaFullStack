package Objetos;

public class Vestuario extends Productos{
    private String talla;
    private String color;
    private Productos producto;

    public Vestuario() {}

    public Vestuario(String talla, String color, String nombre, int precio, int codigo) {
        super(nombre, precio, codigo);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vestuario{" +
                "talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                ", producto=" + producto +
                '}';
    }
}
