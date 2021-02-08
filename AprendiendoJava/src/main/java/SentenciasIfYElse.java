public class SentenciasIfYElse {
    public static void main(String[] args) {
        //TODO auto-generated method stub
        int var=7;
        if ((var==5)||(var>=5)){
            System.out.println("Es verdadero es" + var);
        }else{
            System.out.println("No es " + var);
        }

        //Ejemplo con boolean
        boolean cond;
        cond =  true;
        if (var <= 10 ){
            cond = true;
        }else {
            cond = false;
        }
        if (cond){
            System.out.println("Tu operación es verdadera");
        }else {
            System.out.println("TU operación es false");
        }

    }
}
