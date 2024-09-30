package Objetos;

public class Producto<T> {
    private T item;
    public Producto(T item){
        this.item = item;
    }

    public Producto() {

    }


    public T getItem() {
        return item;
    }
    public void setItem(T item){}

    @Override
    public String toString() {
        return "Producto{" +
                "item=" + item +
                '}';
    }
}
