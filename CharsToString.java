import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char letter1 = scan.nextLine().charAt(0);
        char letter2 = scan.nextLine().charAt(0);
        char letter3 = scan.nextLine().charAt(0);
        String sum = String.valueOf(letter1) + String.valueOf(letter2) + String.valueOf(letter3);
        //System.out.printf("%c%c%c",letter1, letter2, letter3);
        System.out.println(sum);
    }
}
