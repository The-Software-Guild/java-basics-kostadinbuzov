import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        System.out.println("Enter your age, please: ");
        Scanner ageScan = new Scanner(System.in);
        int age = ageScan.nextInt();
        int maxHeartRate = 220 - age;

        System.out.println("Your maximum heart rate should be "
                + maxHeartRate + " beats per minute");

        System.out.println("Your target HR Zone is "
                + (int)(maxHeartRate*0.5) + " - " + (int)(maxHeartRate*0.85)
                + " beats per minute");

    }

}
