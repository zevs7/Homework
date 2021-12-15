package vratsasoftware;

import java.util.Scanner;

public class DimmingNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        switch (n){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(b-1);
                break;
            case 4:
                System.out.println(a*b);
                break;
            case 5:
                System.out.println(a/b);
                break;
            case 6:
                System.out.println(b/a);
                break;
            default:
                System.out.println("Other number");
        }

    }
}
