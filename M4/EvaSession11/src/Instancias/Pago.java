package Instancias;

public interface Pago {
    public void pagar(int costo, String nombre, int dinero);

    public Boolean InicioSession(String contra);
}
