package vratsasoftware;

import java.util.Scanner;

public class SmallAndLargeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallInteger = Integer.MAX_VALUE;
        int bigInteger = Integer.MIN_VALUE;

        for (; ; ) {

            int numberInteger = Integer.parseInt(scanner.nextLine());
            if (numberInteger == 0) {
                break;
            }
            if (numberInteger < smallInteger) {
                smallInteger = numberInteger;
            }
            if (numberInteger > bigInteger) {
                bigInteger = numberInteger;
            }

        }

        System.out.println(bigInteger);
        System.out.println(smallInteger);

    }
}
