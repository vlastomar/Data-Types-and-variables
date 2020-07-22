import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberForAdd = Integer.parseInt(scan.nextLine());
        int number = Integer.parseInt(scan.nextLine());

        String decrypt = "";

        for (int i = 1; i <= number ; i++) {
            char letter = scan.nextLine().charAt(0);
            letter += numberForAdd;
            decrypt += letter;
        }
        System.out.println(decrypt);
    }
}
