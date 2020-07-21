import java.util.Scanner;

public class ConvertMetersToKm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distance = Integer.parseInt(scan.nextLine());

        double km = distance/1000.00;
        System.out.printf("%.2f", km);
    }
}
