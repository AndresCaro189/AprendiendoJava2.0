public class ArreglosBidimensionales {
    public static void main(String[] args) {
        String x[][];
        x = new String[3][3];
        x[0][0]= "Colombia";
        x[0][1]= "Bogota";
        x[0][2]= "Frio";
        x[1][0]= "Usa";
        x[1][1]= "Miama";
        x[1][2]= "Caliente";
        x[2][0]= "España";
        x[2][1]= "Madrid";
        x[2][2]= "No se";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("x["+i+"]["+j+"] = "+x[i][j]) ;
            }
        }
    }
}
