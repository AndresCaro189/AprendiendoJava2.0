package paquete;

import paquete.Pelota;
import paquete.Carro;

public class Main {
    public static void main(String[] args) {
        /*
        Pelota p;
        p =  new Pelota();
        float var = p.obtenerRadio();
        System.out.println("La pelota pesa. " + p.obtenerPeso());
        System.out.println("El Radio de la pelota es " + var);

        Pelota pB = new Pelota(500,500);
        System.out.println("Nueva Pelota Pesa "+ pB.obtenerPeso());
        System.out.println("Su Radio es de "+ pB.obtenerRadio());

        Pelota p1;
        p1=new Pelota(200,200);
        System.out.println("Nueva Pelota pesa "+ p1.obtenerPeso());
        System.out.println("Su radio es de  "+ p1.obtenerRadio());

        p.atraparPelota();
        */

        /*
        Carro c = new Carro();
        c.estado();
        c.encender();
        c.estado();
         */
        /*
        CarroBMW c = new CarroBMW();
        c.estado();
        c.apagar();
        c.encender();
        c.turbo();

        CarroToyota c2 = new CarroToyota();
        c2.estado();
        c2.apagar();
        c2.encender();
        System.out.println(c2.modelo());
        */
        //poliformismo
        CarroBMW c = new CarroBMW();
        c.informacion();
    }
}
