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
                System.out.println("ERROR - You did not enter a valid input! Please try again.");
                scan.nextLine();
            }
        } while (!validInput);
        degreesF = ((double) degreesC * 9/5) + 32;
        System.out.printf("%10s %8.2f", "DegreesC: ", degreesC);
        System.out.printf("\n%10s %8.2f", "DegreesF: ", degreesF);
    }
}
