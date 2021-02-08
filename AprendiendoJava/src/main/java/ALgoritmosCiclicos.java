public class ALgoritmosCiclicos {
    public static void main(String[] args) {
        //ALgoritmos Ciclicos

        //serie de numeros impares
        for (int i = 0; i < 100; i++) {
            if((i%2)!=0){
                System.out.println(i);
            }
        }

        //Serie de fibonacci
        int x = 1;
        int anterior = 0;
        int temp;

        while (true){
            System.out.println(x);
            temp = x;
            x=x+anterior;
            anterior = temp;
            if (x>100){
                break;
            }
        }
    }
}
