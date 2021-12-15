package vratsasoftware;

import java.util.Scanner;

public class Stadium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String capacitS = scanner.nextLine();


        int capacity = Integer.parseInt(capacitS);
        boolean hasLights = true;

        boolean stadium = hasLights || capacity > 35000;
        String aGroup = stadium ? "Enters A group " : "Does not enter A group";

        System.out.println(aGroup);
    }
}
