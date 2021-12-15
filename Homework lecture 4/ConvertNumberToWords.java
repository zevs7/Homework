package vratsasoftware;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConvertNumberToWords {

    private static final String[] hundredsNames = {
            "",
            "Сто",
            "Двеста",
            "Триста",
            "Четиристотин",
            "Петсотин",
            "Шестстотин",
            "седемдстотин",
            "Осемдстотин",
            "деветстотин"
    };

    private static final String[] tensNames = {
            "",
            " Десет",
            " Двасет",
            " Трийсет",
            " Четиресет",
            " Педесет",
            " Шейсет",
            " Седемдесет",
            " Осемдесет",
            " Девересет"
    };

    private static final String[] numNames = {
            "",
            " Едно",
            " Две",
            " Три",
            " Четри",
            " Пет",
            " Шест",
            " Седем",
            " Осем",
            " Девет",
            " Десет",
            " Единадесет",
            " Дванадесет",
            " Тринадесет",
            " Четиринадест",
            " Петнадесет",
            " Шестнадесет",
            " Седемнадесет",
            " Осемнадест",
            " Деветнадесет"
    };

    private ConvertNumberToWords() {}

    public static String convert(int number) {
        // 0 to 1000
        if (number == 0) { return "Нула"; }
        else if (number == 1000) { return "Хиляда"; }
        String d = String.valueOf(number);

        String result = "";
        String soFar;
        int soFarNumber = 0;

        if (number % 100 < 20 && number > 99){
            soFarNumber = number / 100;
            soFar = hundredsNames[soFarNumber];
            result = soFar;

            if(number % 100 > 0  && number > 100){
                soFar = numNames[number % 100];
                result += " и " + soFar.toLowerCase();
            }
        }
        else {
            if(number > 99){
                soFarNumber = number / 100;
                soFar = hundredsNames[soFarNumber];
                result = soFar;

                int toHundred = number % 100;
                int soFarToHundred = toHundred / 10;

                int toTen = number % 100;
                int soFarToTen = toTen % 10;

                if(soFarToHundred > 0){
                    if(soFarToTen > 0){
                        soFar = tensNames[soFarToHundred];
                        result += soFar.toLowerCase();
                        soFar = numNames[soFarToTen];
                        result += " и" + soFar.toLowerCase();
                    }
                    else {
                        soFar = tensNames[soFarToHundred];
                        result += " и" + soFar.toLowerCase();
                    }
                }
                else {
                    soFar = numNames[soFarToTen];
                    result += " и" + soFar.toLowerCase();
                }
            }
            else if(number < 20){
                soFar = numNames[number];
                result = soFar;
            }
            else {
                int soFarToHundred = number / 10;

                int toTen = number % 100;
                int soFarToTen = toTen % 10;

                if(soFarToTen > 0){
                    soFar = tensNames[soFarToHundred];
                    result += soFar;
                    soFar = numNames[soFarToTen];
                    result += " и" + soFar.toLowerCase();
                }
                else {
                    soFar = tensNames[soFarToHundred];
                    result += soFar;
                }
            }
        }

        // remove extra spaces!
        return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

       String result = n + " -> " + ConvertNumberToWords.convert(n);

        System.out.println(result);
    }
}
