import java.util.Arrays;

public class Indexmultiplication {
    public static void main(String[] args){
       int[] initialNumbers = new int[11];
       int [] multiplyIndex = new int[initialNumbers.length];


        for (int i = 0; i < multiplyIndex.length; i++) {
            multiplyIndex[i] = i * i ;
        }
        for (int i = 0; i < multiplyIndex.length; i++) {
            System.out.println(multiplyIndex[i]);
        }


    }



}
