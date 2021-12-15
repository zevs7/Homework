package vratsasoftware;

import java.util.Scanner;


public class MagicSquare {
    static int N = 3;
    public static void main(String[] args) {
        int mat[][] = {{ 11, 22, 33 },
                { 7, 13, 21 },
                { 88, 99, 77 }};

        if (isMagicSquare(mat))
            System.out.println("Magic Square");
        else
            System.out.println("Not a magic" +
                    " Square");
    }



    static boolean isMagicSquare(int mat[][])
    {


        int sumd1 = 0,sumd2=0;
        for (int i = 0; i < N; i++)
        {

            sumd1 += mat[i][i];
            sumd2 += mat[i][N-1-i];
        }

        if(sumd1!=sumd2)
            return false;


        for (int i = 0; i < N; i++) {

            int rowSum = 0, colSum = 0;
            for (int j = 0; j < N; j++)
            {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            if (rowSum != colSum || colSum != sumd1)
                return false;
        }


        return true;
    }
}









