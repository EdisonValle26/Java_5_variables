public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, double altura, double salario) {
        super(nombre, edad, altura); // Llamar al constructor de la clase padre
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamar al método de la clase padre
        System.out.println("Salario: $" + salario);
    }
}