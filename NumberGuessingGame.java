import java.util.Scanner;

import static java.lang.Math.random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        // generate a random number x between 10 and 100
        int x = (int) (random() * 90) + 10;

        // create a counter to count how many times did the user try to guess the number
        int counter = 0;

        while (n != x) {
            counter++;
            // take the guess from the user
            System.out.print("Enter your guess: ");
            n = in.nextInt();

            // in case the user answered correctly
            if (n == x) {
                System.out.println("That is correct!");
                break;
            }
            if (n > x)
                System.out.println("Your guess is higher than x");
            else
                System.out.println("Your guess is lower than x");

        }
        System.out.printf("You have tried for %d times to guess the correct number!",counter);
    }
}
