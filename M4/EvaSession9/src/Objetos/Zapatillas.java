package Objetos;

public class Zapatillas {
    private String marca;

    public Zapatillas(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Zapato de marca " + marca;
    }
}
