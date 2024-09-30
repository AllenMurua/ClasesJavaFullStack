package Objetos;

public class Refrigerador extends Producto{
    private String gastoElectrico;
    private int numPuertas;

    public Refrigerador(String gastoElectrico, int numPuertas, int precio, int cantidad) {
        super(cantidad, precio);
        this.gastoElectrico = gastoElectrico;
        this.numPuertas = numPuertas;
    }

    public String getGastoElectrico() {
        return gastoElectrico;
    }

    public void setGastoElectrico(String gastoElectrico) {
        this.gastoElectrico = gastoElectrico;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Refrigerador{" +
                "gastoElectrico='" + gastoElectrico + '\'' +
                ", numPuertas=" + numPuertas +
                '}';
    }

    @Override
    public void cambiarPrecio() {

    }
}
