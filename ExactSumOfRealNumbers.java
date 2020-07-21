import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <=number ; i++) {
             BigDecimal inputN = new BigDecimal(scan.nextLine());
            sum = sum.add(inputN);
        }
        System.out.println(sum);
    }
}
