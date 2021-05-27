package day09_scanner_practice;
import java.util.Scanner;

public class CentToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        System.out.println("In"+" total : "+dollars+" dollars "+remainingCents+" cents");



    }
}
