public class InstruccionFor {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println("El contador vale: " + contador);
        }
        for (int contador = 10; contador >= 0; contador--) {
            System.out.println("El contador vale: " + contador);
        }
        for (int contador = 1; contador <= 20; contador++) {
            contador= contador*2;
            System.out.println("El contador vale: " + contador);
        }
    }
}
