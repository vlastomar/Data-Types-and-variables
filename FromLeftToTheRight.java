import java.math.BigDecimal;
import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number; i++) {
            String number1S = "";
            String number2S = "";
            double sum = 0;
            String input = scan.nextLine();
            for (int j = 0; j < input.length(); j++) {

                number2S = number2S + String.valueOf(input.charAt(j));
                if (input.charAt(j) == 32) {
                    number2S = number2S.replace(" ", "");
                    number1S = number2S;
                    number2S = "";
                }
            }
            double number1 = Double.parseDouble(number1S);
            double number2 = Double.parseDouble(number2S);

            if (number1 > number2){
                number1 = Math.abs(number1);
                BigDecimal num1 = new BigDecimal(number1);
                //number1S = String.valueOf(number1);
                number1S = num1.toString();
                for (int j = 0; j < number1S.length() ; j++) {
                    if (number1S.charAt(j) == '.'){
                        break;
                    }
                        sum += Double.parseDouble(String.valueOf(number1S.charAt(j)));
                }
            }else{
                number2 = Math.abs(number2);
                BigDecimal num2 = new BigDecimal(number2);
                //number2S = String.valueOf(number2);
                number2S = num2.toString();
                for (int j = 0; j < number2S.length() ; j++) {
                        if (number2S.charAt(j) == '.'){
                            break;
                        }
                        sum += Double.parseDouble(String.valueOf(number2S.charAt(j)));

                }
            }
            System.out.printf("%.0f%n", sum);
        }
    }
}
