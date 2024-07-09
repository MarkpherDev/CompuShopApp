package mundopc;

import mundopc.model.Computadora;
import mundopc.model.Monitor;
import mundopc.model.Raton;
import mundopc.model.Teclado;
import mundopc.service.Orden;

public class Main {

  public static void main(String[] args) {
    //Crear objetos
    Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
    //System.out.println(ratonLenovo);
    Teclado tecladoLenovo = new Teclado("bluetooh", "Lenovo");
    //System.out.println(tecladoLenovo);
    Monitor monitorLenovo = new Monitor("Lenovo", 27);
    //System.out.println(monitorLenovo);
    //Crear Computadora
    Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo,
        tecladoLenovo, ratonLenovo);
    //System.out.println(computadoraLenovo);

    //Objeto Computadora
    Monitor monitorDell = new Monitor("Dell", 15);
    Teclado tecladoDell = new Teclado("usb", "Dell");
    Raton ratonDell = new Raton("usb", "Dell");
    Computadora computadoraDell = new Computadora("Computadora Dell",
        monitorDell, tecladoDell, ratonDell);
    //Creamos una Orden
    Orden orden1 = new Orden();
    orden1.agregarComputadora(computadoraLenovo);
    orden1.agregarComputadora(computadoraDell);
    orden1.mostrarOrden();

    //Computadora MAC
    System.out.println();
    Monitor monitorMac = new Monitor("Mac", 27);
    Teclado tecladoMac = new Teclado("bluetooth", "Mac");
    Raton ratonMac = new Raton("bluetooth", "Marc");
    Computadora computadoraMac = new Computadora("iMac", monitorMac, tecladoMac, ratonMac);

    Orden orden2 = new Orden();
    orden2.agregarComputadora(computadoraMac);
    orden2.agregarComputadora(computadoraDell);
    orden2.agregarComputadora(computadoraLenovo);
    orden2.mostrarOrden();
  }
}