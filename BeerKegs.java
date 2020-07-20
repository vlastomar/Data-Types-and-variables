import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        String nameWinnerKeg = "";
        double maxVolumeKeg = 0.00;

        for (int i = 1; i <= number ; i++) {
            String nameKeg = scan.nextLine();
            double radiusKeg = Double.parseDouble(scan.nextLine());
            int heightKeg = Integer.parseInt(scan.nextLine());
            double volumeKeg = Math.PI * radiusKeg * radiusKeg * heightKeg * 1.00;
            if (volumeKeg > maxVolumeKeg){
                maxVolumeKeg = volumeKeg;
                nameWinnerKeg = nameKeg;
            }

        }
        System.out.println(nameWinnerKeg);
    }
}
