import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingYield = Integer.parseInt(scan.nextLine());
        int spiceMined = 0;
        int counterDays = 0;

        while (true){
            if (startingYield < 100){
                if (spiceMined > 26) {
                    spiceMined -= 26;
                }else if (spiceMined > 0 ){
                    spiceMined = 0;
                }
                System.out.println(counterDays);
                System.out.println(spiceMined);
                break;
            }
            spiceMined += startingYield;
            spiceMined -= 26;
            counterDays += 1;
            startingYield -= 10;




        }
    }
}
