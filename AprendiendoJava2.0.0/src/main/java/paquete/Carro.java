package paquete;

public class Carro {
    //Variables
    double peso;
    double altura;
    double ancho;
    double largo;
    boolean encendido =false;
    int numeroPuertas;
    String modelo;
    //Constructores->un constructor es una subrutina cuya misión es inicializar un objeto de una clase. En el constructor se asignan los valores iniciales del nuevo objeto.
    public Carro(){
        this.peso=10000;
        this.altura=1.9;
        this.ancho=4;
    }
    //Cierre de constructor

    //Metodos
    public double optenerPeso(){
        return this.peso;
    }
    public void encender(){
        encendido=true;
        System.out.println("Tu Carro a Prendido");
    }
    public void apagar(){
        this.encendido=false;
        System.out.println("El carro esta apagado");
    }
    public  void estado(){
        if (this.encendido==true){
            System.out.println("Tu Carro a Prendido");
        } else {
            System.out.println("El carro esta apagado");
        }
    }
}
class CarroBMW extends Carro{
    public CarroBMW(){
        this.modelo="BMW";
    }
    public void turbo(){
        System.out.println("Acabas de viajar a 100millas por hora");
    }
    public void informacion(){
        System.out.println("Este es un BMW del 2011");
    }
}

class CarroToyota extends Carro{
    //Constructor
    public CarroToyota(){
        this.modelo="Toyota";
    }
    //Metodo
    public void informacion(){
        System.out.println("Este es un toyota del 2010");
    }

    public String modelo(){
        return this.modelo;
    }
}