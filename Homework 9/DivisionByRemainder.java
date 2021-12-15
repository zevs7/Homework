package vratsasoftware;

public class DivisionByRemainder {


    public static void main(String[] args){

        System.out.println(DivisionRemainder(11,46));
    }
    public static boolean DivisionRemainder(int a, int b){
        boolean aEqual = a%3 ==0;
        boolean bEqual = a%3 ==0;
        boolean aAndBEqual = aEqual == bEqual;
        return aAndBEqual;



    }


}
