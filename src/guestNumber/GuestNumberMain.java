package guestNumber;

import java.util.Scanner;

import static presentacion.IOManager.print;

public class GuestNumberMain {

    public static void main(String[] args) {

        final GuestNumber game = new GuestNumber(5);
        Scanner scanner = new Scanner(System.in);

        print("Elige un numero del 1 al 50");

        int attemp = 1;

        while (game.hasAttemptsLeft()) {

            int input = scanner.nextInt();
            attemp++;

            if (game.isTheNumber(input)) {
                print("Adivinaste!");
                break;
            } else {
                if (game.getAttemptsLeft() == 0) break;
                print("Numero erroneo. Intente de nuevo (" + attemp + " de 5)");
            }
        }
    }
}
