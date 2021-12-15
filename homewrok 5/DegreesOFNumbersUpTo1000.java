package vratsasoftware;


import java.util.Scanner;

public class DegreesOFNumbersUpTo1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int numbers = scanner.nextInt();
        int score = 1;
        int count = 1;

        while (score <= 1000) {
            score *= numbers;

            if (numbers == 1 || numbers == 0) {
                break;
            }

            if (score <= 1000) {
                System.out.println(score);
            }
            count++;
        }
    }
}
