import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int powerPoke = Integer.parseInt(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustionFactor = Integer.parseInt(scan.nextLine());

        int counterPokedTargets = 0;
        int powerInitial = powerPoke;

        while (true) {
            if (powerPoke == 0.5 * powerInitial) {
                if (exhaustionFactor != 0) {
                    powerPoke = powerPoke / exhaustionFactor;
                }
            }
                if (powerPoke < distance) {
                    System.out.println(powerPoke);
                    System.out.println(counterPokedTargets);
                    break;
                }
                powerPoke -= distance;
                counterPokedTargets += 1;
            }
        }
    }

