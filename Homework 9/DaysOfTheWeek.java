package vratsasoftware;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args){
        System.out.println("Enter a number between 1-7");
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println(Week(day));

    }
    public static int Week(int day){

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Maybe in another universe");
                break;
        }
        return  day;
    }
}
