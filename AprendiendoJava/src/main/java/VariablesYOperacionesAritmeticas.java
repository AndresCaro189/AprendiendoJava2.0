public class VariablesYOperacionesAritmeticas {
    public static void main(String[] args) {
        //sin decimales
        int variable1;
        variable1 = 5;
        int resultado;
        resultado = variable1 / 2;
        System.out.println("El resultado es " + resultado);

        //Con decimales
        double variable2;
        variable2 = 5;
        double resultado2;
        resultado2 = variable2 / 2;
        System.out.println("El resultado es " + resultado2);

        //Con decimales
        float variable3;
        variable3 = 5;
        float resultado3;
        resultado3 = variable3 / 2;
        System.out.println("El resultado es " + resultado3);

        //Codigo completo con todos los resultados
        short suma;
        suma = 3+10;
        int resta = 8 -17;
        long residuo = 9/2;
        float multiplicación = 2*(15*(-2));
        double division = 10/3.4;

        System.out.println("El resultado de la suma es: " +suma);//Suma
        System.out.println("El resultado de la resta es: "+resta);//resta
        System.out.println("El resultado de la multiplicación es: " +multiplicación);//mulriplicación
        System.out.println("El resultado de la división es: "+division);
        System.out.println("El residuo de la division es: "+residuo);//modulo o residuo
    }
}
