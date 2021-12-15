package vratsasoftware;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberModified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int n = random.nextInt(20) + 1;
        // System.out.println(n);// - when you test, you can see the random number

        System.out.println("Enter a number between 1 and 20 ");
        int numbers = Integer.parseInt(scanner.nextLine());
        int count = 1; // I don't need a "counter" but I wanted the player to see on which try he guessed the number.

        while (numbers != n) {
            if (numbers > n) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Too low, try again!");
            }
            int newNumber = Integer.parseInt(scanner.nextLine());
            numbers = newNumber;
            count++;
        }

        if (numbers == n) {
            System.out.println("You guessed right, " + numbers + " is the correct number.");
            System.out.println("You guessed it on the " + count + " try.");
        }
    }
}
