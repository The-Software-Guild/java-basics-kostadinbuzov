import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RockPaperScissors {

    public static void main(String[] args) {

        int computerWins;
        int personWins;
        int ties;
        int result;
        int numOfRounds;
        int playAgain;

        //Play games until the user decides to stop
        do {

            computerWins = 0;
            personWins = 0;
            ties = 0;
            numOfRounds = getNumberOfRounds();

            //Play out all the rounds from the current game
            for (int i = 0; i < numOfRounds; i++) {
                result = playRound();
                if (result == 0) {
                    ties++;
                    System.out.println("It's a tie!\n");
                } else if (result == 1) {
                    computerWins++;
                    System.out.println("You lost!\n");
                } else if (result == 2) {
                    personWins++;
                    System.out.println("You won!\n");
                }
            }

            //Display the results from the current game
            System.out.println("Number of ties: " + ties);
            System.out.println("Number of times the computer won: " + computerWins);
            System.out.println("Number of times you won: " + personWins);

            if (computerWins > personWins) {
                System.out.println("\nComputer won.");
            } else if (personWins > computerWins) {
                System.out.println("\nYou won!");
            } else {
                System.out.println("\nIt's a tie!");
            }

            //Check if the user wants to play again
            System.out.println("Do you want to play again?\n 1 = Yes\n Anything else = No");
            Scanner myScanner = new Scanner(System.in);
            try {
                playAgain = Integer.parseInt(myScanner.nextLine());
            } catch (NumberFormatException ex) {
                playAgain = 0;
            }


        } while (playAgain == 1);
    }

    //The function determines who is the winner of every round
    public static int playRound() {

        System.out.println("What is your choice \n 1 = Rock\n 2 = Paper\n 3 = Scissors?");

        Scanner newScanner = new Scanner(System.in);
        int personChoice;
        while (true) {
            try {
                personChoice = Integer.parseInt(newScanner.nextLine());
                if (personChoice > 3 || personChoice < 1) {
                    System.out.println("Please choose a number 1, 2 or 3");
                } else {
                    break;
                }
            } catch (Exception ex) {
                System.out.println("Please choose a number 1, 2 or 3");
            }
        }

        Random randomChoice = new Random();
        int computerChoice = randomChoice.nextInt(3) + 1;

        //Output the computer's choice
        if (computerChoice == 1) {
            System.out.println("Computer chose Rock!");
        } else if (computerChoice == 2) {
            System.out.println("Computer chose Paper!");
        } else {
            System.out.println("Computer chose Scissors!");
        }

        //Determine the result
        int result;
        if (computerChoice == personChoice) {
            //It is a tie
            result = 0;
        } else if (computerChoice == 1 && personChoice == 3 ||
                computerChoice == 2 && personChoice == 1 ||
                computerChoice == 3 && personChoice == 2) {
            //Computer wins
            result = 1;
        } else {
            //Person wins
            result = 2;
        }
        return result;

    }

    //Ask the user how many rounds they want to play and return the value
    public static int getNumberOfRounds() {
        System.out.println("How many rounds do you want to play? ");
        Scanner myScanner = new Scanner(System.in);
        int numOfRounds = 0;
        try {
            numOfRounds = myScanner.nextInt();
            if (numOfRounds < 1 || numOfRounds > 10) {
                System.out.println("Input needs to be positive integer between 1 and 10");
                System.exit(0);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Input needs to be positive integer between 1 and 10");
            System.exit(0);
        }
        return numOfRounds;
    }
}
