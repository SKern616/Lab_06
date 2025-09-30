import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userGuess = 0;
        int randomNum = (int) (Math.random()*10) + 1;
        boolean validInput = false;

        System.out.println("Welcome! Lets play a game! \nTry to guess my number!");

        do {
            System.out.println("Enter a number [1-10]:");

            if (scan.hasNextInt()) {
                userGuess = scan.nextInt();
                if (userGuess >= 1 && userGuess <= 10) {
                    validInput = true;
                    scan.nextLine();
                } else {
                    System.out.println("ERROR - You did not enter a valid guess! Please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("ERROR - You did not enter a valid guess! Please try again.");
                scan.nextLine();
            }
        } while (!validInput);

        System.out.println("My number was " + randomNum + ".");
        if (userGuess == randomNum) {
            System.out.println("You guessed correctly!");
        } else if (userGuess > randomNum) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was too low.");
        }
    }
}
