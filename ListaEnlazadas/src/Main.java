import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        //add añade un objeto en orden
        lista.add("Palabra");
        lista.add(5);
        lista.add(1,17);
        lista.add("Palabra 2");

        lista.remove(0);

        System.out.println("El tamaño de la lista es "+lista.size());
        System.out.println(lista.get(0));
        System.out.println(lista.getFirst());
        System.out.println(lista.getLast());
    }
}
