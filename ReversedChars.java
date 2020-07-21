import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char letter1 = scan.nextLine().charAt(0);
        char letter2 = scan.nextLine().charAt(0);
        char letter3 = scan.nextLine().charAt(0);

        String sum = String.valueOf(letter3) + " " + String.valueOf(letter2) + " " + String.valueOf(letter1);
        System.out.println(sum);

    }
}
