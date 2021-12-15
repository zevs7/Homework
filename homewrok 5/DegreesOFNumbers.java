package vratsasoftware;
import java.util.Scanner;

public class DegreesOFNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int numbers = scanner.nextInt();
        System.out.println("Please enter the power of the number.");
        int powerOfNumbers = scanner.nextInt();

//        int score = (int)Math.pow(numbers,powerOfNumbers);
//         or
//        int score =1;
//        for (int i = 1;i<=powerOfNumbers ;i++){
//             score =score * numbers;
//        }
//        System.out.println(score);
        int score = 1;
        int count = 1;

        while (count <= powerOfNumbers) {
            score = score * numbers;
            count++;
        }
        System.out.println(score);
    }
}
