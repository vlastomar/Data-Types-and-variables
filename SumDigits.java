import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int num = number;
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
