public class Arreglos {
    public static void main(String[] args) {

        //Forma uno de declarar un arreglo
        int x [];
        x = new int [3];
        x[0]=10;
        x[1]=5;
        x[2]=7;
        for (int i = 0; i < x.length; i++) {
            System.out.println(i+"." +" El numero es " + x[i]);
        }
        //Forma dos de declarar un arreglo
        int y [] = new int [3];
        y[0]=10;
        y[1]=5;
        y[2]=7;
        for (int j = 0; j < y.length; j++) {
            System.out.println(j+"." +" El numero es " + y[j]);
        }
        //Forma tres de declarar un arreglo
        int z [] = {10,5,7};
        for (int k = 0; k < z.length; k++) {
            System.out.println(k+"." +" El numero es " + z[k]);
        }

    }

}
