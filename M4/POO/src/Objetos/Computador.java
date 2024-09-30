package Objetos;

import java.util.List;

public class Computador {
    private  String procesador;
    private  int memoriaRam;
    private  int discoDuro;
    private  String sistemaOperativo;
    private  String color;
    private  String tarjetaGrafica;
    private String tarjetaRed;
    private int puertos;
    private int peso;
    private int precio;
    private String gabinete;
    private String socketProcesador;
    private String pantalla;
    private String teclado;
    private String mouse;
    private List<String> perifericos;

    public Computador() {}

    public Computador(String procesador){this.procesador = procesador;}

    public List<String> getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(List<String> perifericos) {
        this.perifericos = perifericos;
    }

    public Computador(List<String> perifericos) {
        this.perifericos = perifericos;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getTarjetaRed() {
        return tarjetaRed;
    }

    public void setTarjetaRed(String tarjetaRed) {
        this.tarjetaRed = tarjetaRed;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getSocketProcesador() {
        return socketProcesador;
    }

    public void setSocketProcesador(String socketProcesador) {
        this.socketProcesador = socketProcesador;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", discoDuro=" + discoDuro +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", color='" + color + '\'' +
                ", tarjetaGrafica='" + tarjetaGrafica + '\'' +
                ", tarjetaRed='" + tarjetaRed + '\'' +
                ", puertos=" + puertos +
                ", peso=" + peso +
                ", precio=" + precio +
                ", gabinete='" + gabinete + '\'' +
                ", socketProcesador='" + socketProcesador + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", teclado='" + teclado + '\'' +
                ", mouse='" + mouse + '\'' +
                ", perifericos=" + perifericos +
                '}';
    }
}
