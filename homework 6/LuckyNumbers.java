package vratsasoftware;

public class LuckyNumbers {
    public static void main(String[] args) {

        for (int i = 1000; i < 10000; i++) {
            int firstDigitOfNumber = i / 1000;
            int secondDigitsOfNumber = (i / 100) % 10;
            int thirdDigitOfNumber = (i / 10) % 10;
            int fourthDigitOfNumber = i % 10;

            if (firstDigitOfNumber + secondDigitsOfNumber == thirdDigitOfNumber + fourthDigitOfNumber) {
                System.out.println(i);
            }
        }
    }
}
