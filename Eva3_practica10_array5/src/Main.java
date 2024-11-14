public class Main {
    public static void main(String[] args) {

        // Arreglo de 5 dimensiones
        int [][][][][] arreglo = new int[5][5][5][5][5];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[i][j].length; k++) {
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {
                        for (int m = 0; m < arreglo[i][j][k][l].length; m++) {
                            int suma = i + j + k + l + m;
                            System.out.println("arreglo[" + i + "][" + j + "][" + k + "][" + l + "][" + m + "] = " + suma);
                        }
                    }
                }
            }
        }
    }
}