public class funciones_metodos {
    public static void main(String[] args) {
        imprimirMensaje();
        multiplicar(10, 2);
        parImpar(13);
    }

    public static void imprimirMensaje() {
        System.out.println("Este es un mensaje");
    }

    public static void multiplicar(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: " + result);
    }

    public static void parImpar(int num) {
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}