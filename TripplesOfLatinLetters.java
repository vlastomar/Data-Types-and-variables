import java.util.Scanner;

public class TripplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= number ; j++) {
                for (int k = 1; k <= number; k++) {
                    char first = (char)(96+i);
                    char second = (char)(96 + j);
                    char third= (char)(96 + k);
                    System.out.printf("%c%c%c%n", first, second, third );
                }

            }

        }
    }
}
