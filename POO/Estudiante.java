public class Estudiante extends Persona {
    private String semestre;

    public Estudiante(String nombre, int edad, double altura, String semestre) {
        super(nombre, edad, altura); // Llamar al constructor de la clase padre
        this.semestre = semestre;
    }

    public String getGrado() {
        return semestre;
    }

    public void setGrado(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamar al método de la clase padre
        System.out.println("El semestre del estudiante es: " + semestre);
    }
}
