import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startChar = Integer.parseInt(scan.nextLine());
        int endChar = Integer.parseInt(scan.nextLine());

        for (int i = startChar; i <= endChar; i++) {
            System.out.print((char)i + " ");
        }
    }
}
