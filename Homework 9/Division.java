package vratsasoftware;

import java.util.Scanner;

public class Division {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double aNumber = scanner.nextDouble();
            double bNumber = scanner.nextDouble();
            double cNumber = scanner.nextDouble();

            boolean result = checkTheRemainderFromDividing(aNumber, bNumber, cNumber);
            System.out.println(result);
        }

        public static boolean  checkTheRemainderFromDividing (double aNumber,double bNumber, double cNumber) {
            return aNumber % bNumber == aNumber % cNumber;
        }
    }

