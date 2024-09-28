public class Coche {
    // Atributos
    String marca;
    String modelo;
    int velocidad;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0; // Al inicio, la velocidad es cero
    }

    // Método para acelerar
    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("El coche ha acelerado. Velocidad actual: " + velocidad);
    }

    // Método para frenar
    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) {
            velocidad = 0;
        }
        System.out.println("El coche ha frenado. Velocidad actual: " + velocidad);
    }
}
