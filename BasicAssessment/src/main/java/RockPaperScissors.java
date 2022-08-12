import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class RockPaperScissors {

    public static void main(String[] args) {

        int computerWins = 0;
        int personWins = 0;
        int ties = 0;
        int result;
        int numOfRounds;
        int playAgain;
        do{
            numOfRounds = GetNumberOfRounds();
            do {
                result = PlayRound();
                if (result == 0) {
                    ties++;
                    System.out.println("It's a tie!");
                } else if (result == 1) {
                    computerWins++;
                    System.out.println("You lost!");
                } else if (result == 2) {
                    personWins++;
                    System.out.println("You won!");
                }
                numOfRounds--;
            }
            while (numOfRounds > 0);


            System.out.println("Number of ties: " + ties);
            System.out.println("Number of times the computer won: " + computerWins);
            System.out.println("Number of times you won: " + personWins);

            if (computerWins > personWins) {
                System.out.println("\nComputer won.");
            } else if (personWins > computerWins) {
                System.out.println("\nYou won!");
            } else{
                System.out.println("\nIt's a tie!");
            }

            System.out.println("Do you want to play again?\n 1 = Yes\n 0 = No");
            Scanner myScanner = new Scanner(System.in);
            try {
                playAgain = Integer.parseInt(myScanner.nextLine());
            }catch(NumberFormatException ex){
                playAgain = 0;
            }


        }while(playAgain == 1);
    }

    public static int PlayRound(){
        System.out.println("What is your choice \n 1 = Rock\n 2 = Paper\n 3 = Scissors?");
        Scanner newScanner = new Scanner(System.in);
        int personChoice = Integer.parseInt(newScanner.nextLine());
        Random randomChoice = new Random();
        int computerChoice = randomChoice.nextInt(3)+1;

        if(computerChoice == 1){
            System.out.println("Computer chose Rock!\n");
        } else if (computerChoice == 2) {
            System.out.println("Computer chose Paper!\n");
        } else {
            System.out.println("Computer chose Scissors!\n");
        }

        int result;
        if(computerChoice == personChoice){
            result = 0;
        }
        else if(computerChoice == 1 && personChoice == 3 ||
           computerChoice == 2 && personChoice == 1 ||
            computerChoice == 3 && personChoice == 2) {
            //Computer wins
            result = 1;
        } else{
            //Person wins
            result = 2;
        }
        return result;

    }

    public static int GetNumberOfRounds(){
        System.out.println("How many rounds do you want to play? ");
        Scanner myScanner = new Scanner(System.in);
        int numOfRounds = 0;
        try {
            numOfRounds = myScanner.nextInt();
            if(numOfRounds<1 || numOfRounds>10) {
                System.out.println("Input needs to be positive integer between 1 and 10");
                System.exit(0);
            }
        }catch(InputMismatchException ex){
            System.out.println("Input needs to be positive integer between 1 and 10");
            System.exit(0);
        }
        return numOfRounds;
    }
}
