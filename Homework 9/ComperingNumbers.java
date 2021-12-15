package vratsasoftware;

import java.util.Scanner;

public class ComperingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] integerArray = new int[10];
        for (int i = 0; i < integerArray.length; i++) {
            int a = scanner.nextInt();
            integerArray[i] = a;
        }
        printNumbers(integerArray);
    }

    public static void printNumbers(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            printSigns(j, array);
        }
    }

    public static void printSigns(int j, int[] array) {
        if (j + 1 < array.length) {
            if (array[j] > array[j + 1]) {
                System.out.print(" > ");
            } else if (array[j] == array[j + 1]) {
                System.out.print(" = ");
            } else {
                System.out.print(" < ");
            }
        }
    }
}
