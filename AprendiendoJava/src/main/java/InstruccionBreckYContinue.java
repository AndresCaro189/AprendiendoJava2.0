public class InstruccionBreckYContinue {
    public static void main(String[] args) {
        //Ciclo con break
        for (int i = 0; i < 10; i++) {
            System.out.println("Aun estas em el ciclo ");
            if (i == 4){
                break;//Salirse de un ciclo

            }
            System.out.println("El valor del ciclo i es " +i);
        }
        System.out.println("Has dejado el ciclo For");


        //Ciclo con break
        for (int j = 0; j < 10; j++) {
            System.out.println("Aun estas em el ciclo j");
            if (j == 4){
                continue; //Continua el ciclo
            }
            System.out.println("El valor del ciclo j es " +j);
        }
            System.out.println("Has dejado el ciclo For");
    }
}

