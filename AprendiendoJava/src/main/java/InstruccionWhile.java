public class InstruccionWhile {
    public static void main(String[] args) {
        int x = 0;
        while (x<=10){
            System.out.println("El valor de x es " + x);
            x=x+2;
        }

        int y = 0;
        boolean cond=true;
        while (cond){
            System.out.println("El valor de y es: "+y);
            y=y+2;
            if (y>8){
                cond = false;
            }


        }
    }
}
