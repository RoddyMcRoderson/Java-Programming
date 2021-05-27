package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed:");
        int speedLimit = 55;
        int currentSpeed = scan.nextInt();
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("Speed Limit: " + speedLimit + "MPH");
        System.out.println("You are driving " + overTheLimit + "mph over the limit. " +
                "Slow down!");
        System.out.println("Drivers Response: ");
        System.out.println("I have no recollection of the event in question");



    }
}
