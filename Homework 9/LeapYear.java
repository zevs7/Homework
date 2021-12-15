package vratsasoftware;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(leapYear(year));


    }
    public static String leapYear(int year){
        if (year % 4==0){
            return year + " is leap year ";
        }
        else if (year % 100 == 0 && year % 400 != 0){
            return year + "is not leap year ";
        }
        return year + " is not leap year";

    }
}
