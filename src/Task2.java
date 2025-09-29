import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numOfGallons = 0;
        double fuelEff = 0;
        double pricePerGallon = 0;
        boolean validInput = false;
        double milesCost;
        double distanceLeft;

        do {
            System.out.println("Enter current number of gallons of gasoline in your vehicle: ");
            if (scan.hasNextDouble()){
                numOfGallons = scan.nextDouble();
                if (numOfGallons >= 0) {
                    validInput = true;
                    scan.nextLine();
                } else {
                    System.out.println("ERROR - You have entered an invalid number of gallons!");
                    scan.nextLine();
                }
            } else {
                System.out.println("ERROR - You have entered an invalid number of gallons!");
                scan.nextLine();
            }
        } while (!validInput);

        validInput = false;

        do {
            System.out.println("Enter fuel efficiency in MPG: ");
            if (scan.hasNextDouble()) {
                fuelEff = scan.nextDouble();
                if (fuelEff > 0) {
                    validInput = true;
                    scan.nextLine();
                } else {
                    System.out.println("ERROR - You did not enter a valid fuel efficiency!");
                    scan.nextLine();
                }
            } else {
                System.out.println("ERROR - You did not enter a valid fuel efficiency!");
                scan.nextLine();
            }
        } while (!validInput);

        validInput = false;

        do {
            System.out.println("Enter current price for gallon of gas: ");
            if (scan.hasNextDouble()) {
                pricePerGallon = scan.nextDouble();
                if (pricePerGallon > 0) {
                    validInput = true;
                    scan.nextLine();
                } else {
                    System.out.println("ERROR - You did not enter a valid price per gallon!");
                    scan.nextLine();
                }
            } else {
                System.out.println("ERROR - You did not enter a valid price per gallon!");
                scan.nextLine();
            }
        } while (!validInput);

        milesCost = (100/fuelEff) * pricePerGallon;
        distanceLeft = fuelEff * numOfGallons;

        System.out.printf("%10s %10.2f","Cost per 100 miles in $: ", milesCost);
        System.out.printf("\n%10s %10.2f","Distance left in miles: ", distanceLeft);


    }
}
