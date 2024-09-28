public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla");
        // Crear un objeto de la clase Persona
        Persona miPersona = new Persona("Edison", 15, 1.75);
        // Crear un objeto de la clase Empleado
        Empleado miEmpleado = new Empleado("Edison", 15, 1.75, 2500.50);
        // Crear un objeto de la clase Empleado
        Estudiante miEstudiante = new Estudiante("Jose", 35, 1.70, "Octavo");

        // Usar los métodos del objeto Coche
        miCoche.acelerar(50);
        miCoche.frenar(20);

        // Usar los métodos del objeto Persona
        miPersona.setNombre("Andres");
        miPersona.setEdad(25);
        miPersona.setAltura(1.78);
        miPersona.mostrarInfo();

        // Usar los métodos del objeto Empleado
        miEmpleado.mostrarInfo();

        // Usar los métodos del objeto Estudiante
        miEstudiante.mostrarInfo();
    }
}
