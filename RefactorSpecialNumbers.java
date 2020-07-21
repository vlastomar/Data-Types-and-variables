import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        boolean check = false;
        for (int i = 1; i <= number; i++) {
            int num = i;
            int sum = 0;
            String result;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            check = (sum == 5) || (sum == 7) || (sum == 11);
            if (check){
                result = "True";
            }else {
                result = "False";
            }
            System.out.printf("%d -> %s%n", i,result);
        }

    }
}
