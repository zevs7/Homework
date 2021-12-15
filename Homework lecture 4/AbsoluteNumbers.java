package vratsasoftware;

import java.util.Scanner;

public class AbsoluteNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int number = Math.abs(n);
        int twentyOne = 21;

        int x = twentyOne - number;
        int result = Math.abs(x);

        if(result > twentyOne){
            result *= 2;
        }

        String resultStr = "(" + n + ") -> " + result;

        System.out.println(resultStr);

    }
}
