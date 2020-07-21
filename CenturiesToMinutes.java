import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int cent = 100 * number;
        int days = (int) (365.2422  * cent) ;
        long hours =  days * 24;
        long minutes = hours * 60;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                number, cent, days, hours, minutes);

    }
}