import java.util.Scanner;

/**
 * Assignment submission
 *
 * @author Sakshyam Khadka
 * @version 01
 */
public class Rickshawcalc
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // the fare rules section
        double basefare = 30;
        double perkm = 25;
        double permin = 5;
        double localdiscountrate = 0.10;
        double nightsurcharge = 0.20;

        // the fare input section
        System.out.println("Enter the distance in KM: ");
        double distance = sc.nextDouble();

        System.out.println("Enter the time in minutes: ");
        int time = sc.nextInt();

        System.out.println("Is the customer local? Yes / No: ");
        String isLocal = sc.next();

        System.out.println("Is it night time? Yes / No: ");
        String isNight = sc.next();

        // fare calculation section
        double fare = basefare + (perkm * distance) + (permin * time);

        // Give discount?
        double localDiscount = 
            (isLocal.equalsIgnoreCase("Yes") && distance > 10)
            ? fare * localdiscountrate
            : 0;

        fare -= localDiscount;

        // Apply the night charge?
        double nightSurcharge =
            (isNight.equalsIgnoreCase("Yes"))
            ? fare * nightsurcharge
            : 0;

        fare += nightSurcharge;

        // displaying fare section
        System.out.println("Final fare: Rs " + Math.round(fare));
        sc.close();
    }
}
