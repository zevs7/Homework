package vratsasoftware;

public class SelectionSort {
    public static void main(String[] args){
        int[] array = {2,3,45,45,6577657,876,987};

        for (int i = 0; i < array.length; i++) {

            int minElement = 0;
            int minElementIndex = -1;
             for (int j = i+1; j < array.length; j++) {
                if (minElement > array[j]){
                    minElement = array[j];
                    minElementIndex = j;
                }
            }
             int swap = array[i];
        }
    }
}
