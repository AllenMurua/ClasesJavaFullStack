import Objetos.Computador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
                Computador computador1 = new Computador();
                computador1.setProcesador("Intel Core i7");
                computador1.setMemoriaRam(16);
                computador1.setDiscoDuro(512);
                computador1.setSistemaOperativo("Windows 11");
                computador1.setColor("Negro");
                computador1.setTarjetaGrafica("NVIDIA GeForce RTX 3070");
                computador1.setTarjetaRed("Realtek");
                computador1.setPuertos(6);
                computador1.setPeso(2500);
                computador1.setPrecio(1500);
                computador1.setGabinete("ATX");
                computador1.setSocketProcesador("LGA1200");
                computador1.setPantalla("27 pulgadas");
                computador1.setTeclado("Mecánico");
                computador1.setMouse("Óptico");

                Computador computador2 = new Computador();
                computador2.setProcesador("AMD Ryzen 5");
                computador2.setMemoriaRam(8);
                computador2.setDiscoDuro(256);
                computador2.setSistemaOperativo("Ubuntu");
                computador2.setColor("Blanco");
                computador2.setTarjetaGrafica("AMD Radeon RX 580");
                computador2.setTarjetaRed("Intel");
                computador2.setPuertos(4);
                computador2.setPeso(1800);
                computador2.setPrecio(800);
                computador2.setGabinete("Micro ATX");
                computador2.setSocketProcesador("AM4");
                computador2.setPantalla("24 pulgadas");
                computador2.setTeclado("Membrana");
                computador2.setMouse("Láser");

                Computador computador3 = new Computador("Intel Core i5");
                computador3.setMemoriaRam(12);
                computador3.setDiscoDuro(1024);
                computador3.setSistemaOperativo("macOS");
                computador3.setColor("Gris Espacial");
                computador3.setTarjetaGrafica("Apple M1");
                computador3.setTarjetaRed("Apple");
                computador3.setPuertos(8);
                computador3.setPeso(2000);
                computador3.setPrecio(2000);
                computador3.setGabinete("All-in-One");
                computador3.setSocketProcesador("SoC");
                computador3.setPantalla("21.5 pulgadas");
                computador3.setTeclado("QWERTY");
                computador3.setMouse("Magic Mouse");

                Computador computador4 = new Computador("Intel Core i3");
                computador4.setMemoriaRam(4);
                computador4.setDiscoDuro(500);
                computador4.setSistemaOperativo("Windows 10");
                computador4.setColor("Azul");
                computador4.setTarjetaGrafica("Intel HD Graphics");
                computador4.setTarjetaRed("Intel");
                computador4.setPuertos(3);
                computador4.setPeso(3000);
                computador4.setPrecio(600);
                computador4.setGabinete("ATX");
                computador4.setSocketProcesador("LGA1151");
                computador4.setPantalla("22 pulgadas");
                computador4.setTeclado("Compacto");
                computador4.setMouse("Bluetooth");

                Computador computador5 = new Computador("AMD Ryzen 7");
                computador5.setMemoriaRam(32);
                computador5.setDiscoDuro(2048);
                computador5.setSistemaOperativo("Fedora Linux");
                computador5.setColor("Rojo");
                computador5.setTarjetaGrafica("NVIDIA GeForce GTX 1660");
                computador5.setTarjetaRed("Qualcomm");
                computador5.setPuertos(5);
                computador5.setPeso(2200);
                computador5.setPrecio(1200);
                computador5.setGabinete("Mini ITX");
                computador5.setSocketProcesador("AM4");
                computador5.setPantalla("29 pulgadas");
                computador5.setTeclado("Ergonómico");
                computador5.setMouse("Alámbrico");

                System.out.println(computador1);
                System.out.println(computador2);
                System.out.println(computador3);
                System.out.println(computador4);
                System.out.println(computador5);

        List<String> perifericos = new ArrayList<>();
        perifericos.add("Teclado");
        perifericos.add("Mouse");
        perifericos.add("Pantalla");
        perifericos.add("Gabinete");
        perifericos.add("Parlantes");
        computador1.setPerifericos(perifericos);


    }
}