package vratsasoftware;

import java.util.Scanner;

public class EquailateralTriagle {
    public static void main(String[] args) {
        System.out.println("Please enter the side of the triangle.");
        Scanner scanner = new Scanner(System.in);
        int extendOfSide = scanner.nextInt();

        for (int i = 1; i <= extendOfSide; i++) {
            for (int interval = 1; interval <= extendOfSide - i; interval++) {
                System.out.print(" ");
            }
            for (int sign = 1; sign <= (2 * i) - 1; sign++) {
                System.out.print("о");
            }
            System.out.println();
        }
    }
}
