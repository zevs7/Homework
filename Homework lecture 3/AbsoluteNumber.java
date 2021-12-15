package vratsasoftware;

import java.util.Scanner;
import java.lang.Math;

public class AbsoluteNumber {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        int wholeNumber = Integer.parseInt(number);


        int absoluteNumber = Math.abs(wholeNumber);



        System.out.println(absoluteNumber);



    }
}
