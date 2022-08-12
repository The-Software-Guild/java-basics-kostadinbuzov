import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        //Get the age of the person as positive number
        System.out.println("Enter your age, please: ");
        Scanner ageScan = new Scanner(System.in);
        int age;
        while(true) {
            try {
                age = Integer.parseInt(ageScan.nextLine());
                if (age <= 0 || age>150) {
                    System.out.println("Age must be a natural number less than 150.");
                }
                else{
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Age must be a natural number less than 150.");
            }
        }

        //Calculate and print the maximum heart rate and the healthy target
        int maxHeartRate = 220 - age;

        System.out.println("Your maximum heart rate should be "
                + maxHeartRate + " beats per minute");

        System.out.println("Your target HR Zone is "
                + (int)(maxHeartRate * 0.5) + " - " + (int)(maxHeartRate * 0.85)
                + " beats per minute");

    }

}
