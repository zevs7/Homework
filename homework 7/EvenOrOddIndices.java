public class EvenOrOddIndices {
    public static void main(String[] args) {
        int arr1[] = {13, 18, 145, 70, 90, 00};
        int arr2[] = {11, 22, 33, 44, 55, 77};
        int n1 = 5;

        System.out.println("Original Array: ");
        printArray(arr1, arr2, n1);

        arrangeOddAndEven(arr1, arr2, n1);

        System.out.println("\nModified Array: ");
        printArray(arr1, arr2, n1);


    }

    public static void arrangeOddAndEven(int arr1[], int arr2[], int n) {
        int oddInd = 1;
        int evenInd = 0;
        while (true) {
            while (evenInd < n && arr1[evenInd] % 2 == 0)
            evenInd += 1;

            while (oddInd < n && arr1[oddInd] % 2 == 1)
                oddInd += 1;
            while (evenInd < n && arr2[evenInd] % 2 == 0)
                evenInd += 2;



            if (evenInd < n && oddInd < n) {
                int temp = arr1[evenInd];
                arr1[evenInd] = arr1[oddInd];
                arr1[oddInd] = temp;
            }
            if (evenInd < n && oddInd < n) {
                int temp = arr2[evenInd];
                arr2[evenInd] = arr2[oddInd];
                arr2[oddInd] = temp;
            }
             else
                break;
        }
    }

    public static void printArray(int arr1[], int arr2[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr1[i] + " ");
        for (int i = 0; i < n; i++)
            System.out.print(arr2[i] + " ");
    }
}

