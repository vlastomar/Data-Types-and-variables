import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number1 = Double.parseDouble(scan.nextLine());
        double number2 = Double.parseDouble(scan.nextLine());

        BigDecimal num1 = new BigDecimal(number1);
        BigDecimal num2 = new BigDecimal(number2);
        num2=num2.subtract(num1);
        num2=num2.abs();
        BigDecimal exp = new BigDecimal("0.000001");
        if (num2.equals(exp)){
            System.out.println("False");
        }else if (num2.compareTo(exp) > 0){
            System.out.println("False");
        }else if (num2.compareTo(exp) < 0){
            System.out.println("True");
        }

    }
}
