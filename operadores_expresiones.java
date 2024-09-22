public class operadores_expresiones {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Operaciones aritméticas
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Módulo: " + (num1 % num2));

        // Operadores de comparación
        System.out.println("num1 es mayor que num2? " + (num1 > num2));
        System.out.println("num1 es igual a num2? " + (num1 == num2));

        // Operadores lógicos
        boolean resultado = (num1 > 0 && num2 > 0);
        System.out.println("¿Ambos son positivos? " + resultado);
    }
}