package paquete;
//Libreria para entraa y dalida de información del teclado
import java.io.*;
import java.util.Locale;

public class Main {
    /**
     * @param args
     * leer desde el teclado
     * concat()
     * toUpperCase()
     * toLowerCase()
     * length()
     * Convertir Variables numericas a Strings y Viceversa
     */
    public static void main (String[] args){
        //Todo Auto-generated method stub
        /*
        //leer desde el teclado
        String texto = "";

        //Canal de datos
        InputStreamReader in = new InputStreamReader(System.in);
        //Espacio en memoria que almacenara la memoria los datos
        BufferedReader buffer = new BufferedReader(in);

        try{
            texto=buffer.readLine();
        }catch (IOException e){};
        //concat()
        texto = texto.concat(" -Esto Es Una Concatenación");
        //toUpperCase()
        texto = texto.toUpperCase();
        System.out.println(texto);

        //toLowerCase()
        texto = texto.toLowerCase();
        System.out.println(texto);

        //length()
        int a = texto.length();
        System.out.println(texto);
        System.out.println("La frase tiene " +a + " Caracteres");
        */
        //Convertir Variables numericas a Strings y Viceversa
        /*
        String texto = "";
        int x= 0;
        //Canal de datos
        InputStreamReader in = new InputStreamReader(System.in);
        //Espacio en memoria que almacenara la memoria los datos
        BufferedReader buffer = new BufferedReader(in);

        try {
            texto = buffer.readLine();
            x =Integer.parseInt(texto);
        }catch (Exception e){
            System.out.println("Debes escribir un numero");
        };
            System.out.println(x + 5);
        */
        /*
        String texto = "";
        double x= 0;
        //Canal de datos
        InputStreamReader in = new InputStreamReader(System.in);
        //Espacio en memoria que almacenara la memoria los datos
        BufferedReader buffer = new BufferedReader(in);

        try {
            texto = buffer.readLine();
            x =Double.parseDouble(texto);
        }catch (Exception e){
            System.out.println("Debes escribir un numero");
        };
        System.out.println(x + 5);
        */

        //Cambiar de numero a texto
        String texto = "";
        double x= 50.3;

        texto=String.valueOf(x);
        texto =texto.concat(" -Double");
        System.out.println(texto);
    }
}
