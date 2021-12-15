package vratsasoftware;

import java.util.Scanner;

public class NumberDivideBy5 {
    public static void main(String[] args) {
        System.out.println("Please enter the largest range of a number.");

        Scanner scanner = new Scanner(System.in);
        int theLargestRangeOfANumber = scanner.nextInt();

        for (int i = 0; i <= theLargestRangeOfANumber; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
