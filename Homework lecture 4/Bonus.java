package vratsasoftware;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        int bonus = scanner.nextInt();



        switch (bonus){
            case 1:
            case 2:
            case 3:
                System.out.println(score * 10);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(score * 100);
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(score * 1000);
                break;
            default:
                System.out.println("Not valid number");

        }
    }
}
