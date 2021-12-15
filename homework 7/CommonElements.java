public class CommonElements {
    public static void main(String[] args){
        int[] arrayOne = {1,2,3,4,5,6};
        int[] arrayTwo = {7,9,11,19,8};
        int[] score = new int[5];
        int count = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j] ){
                    score[count] = arrayOne[i];
                    count++;
                }

            }
            
        }
        int[] endArray =  new int[count];
        for (int i = 0; i < endArray.length; i++) {
            endArray[i] = score[i];
        }
        for (int i = 0; i < endArray.length; i++) {
            System.out.print(endArray[i] + " ");
        }
            
        }

    }

