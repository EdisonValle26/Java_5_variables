public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla");
        // Crear un objeto de la clase Persona
        Persona miPersona = new Persona("Edison", 15, 1.75);

        // Usar los métodos del objeto Coche
        miCoche.acelerar(50);
        miCoche.frenar(20);

        // Usar los métodos del objeto Persona
        miPersona.setNombre("Andres");
        miPersona.setEdad(25);
        miPersona.setAltura(1.78);
        miPersona.mostrarInfo();
    }
}
