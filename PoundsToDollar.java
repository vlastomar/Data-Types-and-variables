import java.util.Scanner;

public class PoundsToDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dollar = Double.parseDouble(scan.nextLine());
        dollar = dollar * 1.310;
        System.out.printf("%.3f", dollar);
    }
}
