package vratsasoftware;

import java.util.Scanner;

public class matricesOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number between 1 and 20");
        int number = Integer.parseInt(scanner.nextLine());
        int sequentialNumber = number;

        for (int i = number; i > 0; i--) {

            for (int j = sequentialNumber - (number - 1); j - 1 <= sequentialNumber - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            sequentialNumber++;
        }

    }
}
