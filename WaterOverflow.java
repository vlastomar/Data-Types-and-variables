import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = 1; i <= number ; i++) {
            int pourWater = Integer.parseInt(scan.nextLine());
            sum += pourWater;
            if (sum > 255){
                System.out.println("Insufficient capacity!");
                sum -= pourWater;
            }

        }
        System.out.println(sum);
    }
}
