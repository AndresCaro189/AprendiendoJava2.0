package Paquete;
import  java.io.*;

public class Texto {
    public void leer (String nombreArchivo){
        try{
            //La clase FileReader se una para leer archivos de texto
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);


            //Se genera un ciclo para leer el archivo.txt todas las lineas
            String temp="";
            while (temp!=null){
                temp =buffer.readLine();
                if(temp == null){
                    break;
                }
                System.out.println(temp);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
