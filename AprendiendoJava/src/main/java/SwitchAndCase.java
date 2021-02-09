public class SwitchAndCase {
    public static void main(String[] args) {

        //int
        int x;
        x = 0;
        switch (0) {
            case 0: {
                System.out.println("Esta es la opción 0");
                break;
            }

            case 1: {
                System.out.println("Esta es la opción 1");
                break;
            }
            default:{
                System.out.println("Esta es la opción por defecto");
            }
        }

        //char
        char y;
        y = 'a';
        switch (y) {
            case 'a': {
                System.out.println("Esta es la opción a");
                break;
            }

            case 'b': {
                System.out.println("Esta es la opción b");
                break;
            }
            default:{
                System.out.println("Esta es la opción por defecto");
            }
        }
    }
}
