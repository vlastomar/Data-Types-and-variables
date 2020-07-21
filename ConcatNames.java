import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String deimiter = scan.nextLine();

        System.out.printf("%s%s%s", name1, deimiter, name2);
    }
}
