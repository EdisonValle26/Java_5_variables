public class estructuras_control {
    public static void main(String[] args) {
        int num1 = 10;

        if (num1 > 0) {
            System.out.println("El numero es positivo");
        } else if (num1 < 0) {
            System.out.println("El numero es negativo");
        } else if (num1 == 0) {
            System.out.println("El numero es 0");
        } else {
            System.out.println("El numero no existe o no es un numero");
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("El numero es: " + j);
        }

        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println("El valor es: " + i);
            }
            i++;
        }

    }
}