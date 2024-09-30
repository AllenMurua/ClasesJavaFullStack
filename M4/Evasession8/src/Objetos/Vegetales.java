package Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vegetales extends Productos{
    private Date fechaEnvasado;
    private Date fechaVencimiento;
    private Productos producto;

    public Vegetales() {}

    public Vegetales(String nombre, int precio, int codigo, String fechaEnvasadoStr, String fechaVencimientoStr) throws ParseException, ParseException {
        super(nombre, precio, codigo);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.fechaEnvasado = sdf.parse(fechaEnvasadoStr);
        this.fechaVencimiento = sdf.parse(fechaVencimientoStr);
    }



    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Vegetales{" +
                "fechaEnvasado=" + fechaEnvasado +
                ", fechaVencimiento=" + fechaVencimiento +
                ", producto=" + producto +
                '}';
    }
}
