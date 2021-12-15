import java.util.Arrays;
import java.util.*;
public class TheSecondLargestNumber {


    public static void main(String[] args){
        int arr[] = {11, 33, 111, 133, 46, 64};
        int number = arr.length;
        printTwolargest(arr, number);

    }
    static void printTwolargest(int array[],
                              int size_arr)
    {
        int i, firstNumber, secondNumber;


        if (size_arr < 2)
        {
            System.out.print(" Invalid Input ");
            return;
        }


        Arrays.sort(array);


        for (i = size_arr - 2; i >= 0; i--)
        {

            if (array[i] != array[size_arr - 1])
            {
                System.out.printf("The second largest " +
                        "element is %d\n", array[i]);
                return;
            }
        }

        System.out.print("There is no second " +
                "largest element\n");
    }
}
