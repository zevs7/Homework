package vratsasoftware;

public class SumOfAllElements {
    static int m = 6;
    static int n = 6;
    public static void main(String[] args){
        int i, j;
        int[][] arr = new int[m][n];


        int x = 1;
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j+=2)
                arr[i][j] = x++;




        column_sum(arr);

        row_sum(arr);

    }
    static void row_sum(int arr[][])
    {

        int i, j, sum = 0;

        System.out.print("\nFinding Sum of each row:\n\n");


        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {

                sum = sum + arr[i][j];
            }


            System.out.println("Sum of the row " + i + " = "
                    + sum);


            sum = 0;
        }
    }





    // Function to calculate sum of each column
    static void column_sum(int arr[][])
    {

        int row, col, sum = 0;

        System.out.print(
                "\nFinding Sum of each column:\n\n");

        // finding the column sum
        for (row = 0; row < m; ++row) {
            for (col = 0; col < n; col++) {

                // Add the element
                sum = sum + arr[row][col];
            }


            System.out.println("Sum of the column " + col
                    + " = " + sum);


            sum = 0;
        }
    }
}
