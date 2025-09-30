import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double side1 = 0;
        double side2 = 0;
        double perimeter = 0;
        double area = 0;
        double diagonal = 0;
        boolean validInput = false;

        do {
            System.out.println("Enter length of side 1:");
            if (scan.hasNextDouble()) {
                side1 = scan.nextDouble();
                if (side1 > 0) {
                    validInput = true;
                    scan.nextLine();
                } else {
                    System.out.println("ERROR - You did not enter a valid side length!");
                    scan.nextLine();
                }
            } else {
                System.out.println("ERROR - You did not enter a valid side length!");
                scan.nextLine();
            }
        } while (!validInput);

        validInput = false;

        do {
            System.out.println("Enter length of side 2:");
            if (scan.hasNextDouble()) {
                side2 = scan.nextDouble();
                if (side2 > 0) {
                    validInput = true;
                    scan.nextLine();
                } else {
                    System.out.println("ERROR - You did not enter a valid side length! Please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("ERROR - You did not enter a valid side length! Please try again.");
                scan.nextLine();
            }
        } while (!validInput);

        perimeter = (side1 * 2) + (side2 * 2);
        area = side1 * side2;
        diagonal = Math.sqrt((side1 * side1) + (side2 * side2));
        System.out.printf("%-10s %10.2f","Side 1:", side1);
        System.out.printf("\n%-10s %10.2f","Side 2:", side2);
        System.out.printf("\n%-10s %10.2f","Area:", area);
        System.out.printf("\n%-10s %10.2f","Perimeter:", perimeter);
        System.out.printf("\n%-10s %10.2f","Diagonal:", diagonal);
    }

}
