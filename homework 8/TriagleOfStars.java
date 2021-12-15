package vratsasoftware;

import java.util.Scanner;

public class TriagleOfStars {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int row = 0 ; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            row = row + 1;
            System.out.println();
        }

    }
}
