import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {

        System.out.println("What is the name of your dog?");
        Scanner nameInput = new Scanner(System.in);
        String dogName = nameInput.nextLine();
        System.out.println("Well then, I have this highly reliable report on "
                + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");
        Random getPercentages = new Random();

        String[] dogBreeds = new String[5];
        dogBreeds[0] = "St. Bernard";
        dogBreeds[1] = "Chihuahua";
        dogBreeds[2] = "Dramatic RedNosed Asian Pug";
        dogBreeds[3] = "Common Cur";
        dogBreeds[4] = "King Doberman";

        int limit = 100;
        int percentage;

        for (int i = 4; i >= 1; i--) {
            percentage = getPercentages.nextInt(limit - i) + 1;
            System.out.println(percentage + "% " + dogBreeds[i]);
            limit = limit - percentage;

        }
        System.out.println(limit + "% " + dogBreeds[0]);
    }


}
