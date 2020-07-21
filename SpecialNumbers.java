import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number ; i++) {
            int num = i;
            int sumNum = 0;
            while (num > 0){
                sumNum += num % 10;
                num = num / 10;
            }
            if (sumNum == 5 || sumNum == 7 || sumNum == 11){
                System.out.printf("%d -> True%n", i);
            }else {
                System.out.printf("%d -> False%n", i);
            }

        }
    }
}
