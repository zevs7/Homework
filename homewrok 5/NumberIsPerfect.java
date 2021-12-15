package vratsasoftware;


import java.util.Scanner;
public class NumberIsPerfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is perfect");
        int numbers = Integer.parseInt(scanner.nextLine());
        int count = numbers - 1;
        int amountOfDivisors = 0;

        while (count > 0) {
            if (numbers % count == 0) {
                amountOfDivisors += count;
            }
            count--;
        }
        if (amountOfDivisors == numbers) {
            System.out.println("It is perfect");
        } else {
            System.out.println(numbers + " is not perfect");
        }
    }
}
