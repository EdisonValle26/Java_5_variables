public class arrays_multidimensionales {

    public static void main(String[] args) {
        // int [][] matriz = new int[3][3];
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(matriz[0][0]);

        imprimirMatriz(matriz);

        int suma = imprimirSuma(matriz);
        System.out.println("La suma de los elementos es: " + suma);

    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }

    public static int imprimirSuma(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}