package guestNumber;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {

        boolean fin = false;
        final int numeroAAdivinar = generarNumero();
        Scanner scanner = new Scanner(System.in);
        int intento = 1;

        System.out.println("Adivine el numero");

        while (!fin && intento < 5) {

            int input = scanner.nextInt();

            if (input == numeroAAdivinar) {
                System.out.println("Adivinaste!");
            } else {
                intento++;
                System.out.println("Numero erroneo. Intente de nuevo (" + intento + " de 5)");
            }
        }
    }

    public static int generarNumero() {
        Random random = new Random();
        return random.nextInt(49) + 1;
    }
}
