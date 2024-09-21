public class variables {
    public static void main(String[] args) {
        String nombre = "Edison";
        int edad = 25;
        double salario = 850.50;
        char inicial = 'J';
        boolean esEstudiante = true;
        String resPositiva = "Sí";
        String resNegativa = "No";

        System.out.println("El nombre es: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Inicial: " + inicial);

        if (esEstudiante == true) {
            System.out.println("Es estudiante: " + resPositiva);
        } else {
            System.out.println("Es estudiante: " + resNegativa);
        }
    }
}
