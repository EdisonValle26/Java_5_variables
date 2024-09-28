public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;
    private double altura;

    // Constructor
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >= 0) { // Validación simple
            this.edad = edad;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) { // Validación simple
            this.altura = altura;
        }
    }

    // Método para mostrar la información de la persona
    public void mostrarInfo() {
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("La edad de la persona es: " + edad);
        System.out.println("La altura de la persona es: " + altura);
    }

}