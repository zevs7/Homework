package vratsasoftware;

import java.util.Scanner;

public class Triagle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        String number3 = scanner.nextLine();

        int aHalf = Integer.parseInt(number1);
        int bHalf = Integer.parseInt(number2);
        int cHalf = Integer.parseInt(number3);

        boolean sideA = cHalf+bHalf < aHalf;
        boolean sideB = aHalf + cHalf < bHalf;
        boolean sideC =  aHalf + bHalf < cHalf;

        boolean sideThan0 = aHalf > 0 || bHalf > 0 || cHalf > 0;
        boolean trigale = sideA && sideB && sideC && sideThan0;

        System.out.println(trigale);

    }
}
