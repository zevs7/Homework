package vratsasoftware;

import java.util.Scanner;

public class automobile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ageS = scanner.nextLine();
        String priceS = scanner.nextLine();

        int age = Integer.parseInt(ageS);
        int price = Integer.parseInt(priceS);

        boolean automobileHighClass1 = age > 5 && price > 20000;
        boolean automobileHighClass2 = age <= 5 && price > 40000;

        boolean highClass = automobileHighClass1 || automobileHighClass2;

        System.out.println(highClass);
    }
}
