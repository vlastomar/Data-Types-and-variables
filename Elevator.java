import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scan.nextLine());
        int capacityElevator = Integer.parseInt(scan.nextLine());

        int coursesElevator = 0;
        if (capacityElevator > numberPeople){
            coursesElevator = 1;
        }else if (numberPeople % capacityElevator == 0){
            coursesElevator = numberPeople/capacityElevator;
        }else {
            coursesElevator = numberPeople/capacityElevator + 1;
        }
        System.out.println(coursesElevator);

    }
}
