package paquete;

import paquete.Pelota;

public class Main {
    public static void main(String[] args) {
        Pelota p;
        p =  new Pelota();
        float var = p.obtenerRadio();
        System.out.println("La pelota pesa. " + p.obtenerPeso());
        System.out.println("El Radio de la pelota es " + var);

        Pelota pB = new Pelota(500,500);
        System.out.println("Nueva Pelota Pesa "+ pB.obtenerPeso());
        System.out.println("Su Radio es de "+ pB.obtenerRadio());








    }
}
