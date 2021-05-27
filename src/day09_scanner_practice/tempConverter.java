package day09_scanner_practice;
import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("#######F to C CONVERTER PROGRAM#######");
        System.out.println("Enter temp in Fahrenheit:");
       double fahrenheitValue = scan.nextDouble();
       double celciusValue = (fahrenheitValue - 32) * 5/9;
        System.out.println("is " + celciusValue + " in celcius");
    }
}
