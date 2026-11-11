
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;

        System.out.println("Welcome to Number Guessing Game!");

        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();

            if (guess < number) {
                System.out.println("Too Low!");
            } else if (guess > number) {
                System.out.println("Too High!");
            } else {
                System.out.println("Correct! You Win!");
            }

        } while (guess != number);

        sc.close();
    }
}
