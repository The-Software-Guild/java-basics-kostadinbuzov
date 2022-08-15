import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        //Get the name of the user's dog
        System.out.println("What is the name of your dog?");

        Scanner nameInput = new Scanner(System.in);
        String dogName = nameInput.nextLine();

        System.out.println("Well then, I have this highly reliable report on "
                + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");

        //Create an array with dog names
        String[] dogBreeds = new String[]{"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};

        int limit = 100;
        int percentage;
        Random getPercentages = new Random();

        //Give random percentages to each dog breed, summing up to 100%
        for (int i = 4; i >= 1; i--) {
            percentage = getPercentages.nextInt(limit - i) + 1;
            System.out.println(percentage + "% " + dogBreeds[i]);
            limit = limit - percentage;

        }
        System.out.println(limit + "% " + dogBreeds[0]);
    }


}
