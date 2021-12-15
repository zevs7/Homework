package vratsasoftware;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args){


        vowelLetter('m');
        vowelLetter('u');

    }

    public static void vowelLetter(char vowel)
    {
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o'
                || vowel == 'u') {
            System.out.println("It is a Vowel.");
        }
        else {
            System.out.println("It is a Consonant.");
        }

    }

}
