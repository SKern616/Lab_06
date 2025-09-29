import java.util.Scanner;

 class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double degreesC = 0;
        boolean validInput = false;
        double degreesF;

        do {
            System.out.println("Please enter a temperature in degrees C that you would like to convert to degrees F: ");
            if (scan.hasNextDouble()){
                degreesC = scan.nextDouble();
                validInput = true;
            } else {
                System.out.println("ERROR - You did not enter a valid input!");
                scan.nextLine();
            }
        } while (!validInput);
        degreesF = ((double) degreesC * 9/5) + 32;
        System.out.printf("Degrees C: %8.2f", degreesC);
        System.out.printf("\nDegrees F: %8.2f", degreesF);
    }
}
