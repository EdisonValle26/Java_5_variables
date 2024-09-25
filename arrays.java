public class arrays {

    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 4, 5 };

        imprimirArray(lista);

        int max = encontrarMayor(lista);
        System.out.println("El numero mayor es: " + max);
    }

    public static void imprimirArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static int encontrarMayor(int[] array) {
        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

}
