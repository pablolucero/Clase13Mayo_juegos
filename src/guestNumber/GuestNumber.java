package guestNumber;

import java.util.Random;

public class GuestNumber {

    private int attemptsLeft;
    private int number;

    public GuestNumber(int attempts) {
        this.attemptsLeft = attempts;
        number = generateRandomNumber();
    }

    public boolean isTheNumber(int n) {
        attemptsLeft--;
        return n == number;
    }

    public boolean hasAttemptsLeft() {
        return attemptsLeft > 0;
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(49) + 1;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }
}
