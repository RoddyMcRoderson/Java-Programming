package day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your oder total price: ");
        double totalPrice = scan.nextDouble();
        if (totalPrice >= 25) {
            System.out.println("Free SHIPPING ELIGIBLE. Your order total: $" + totalPrice);
        } else {
            System.out.println("Not eligible for free shipping. Your order total is $10 less than minimum of $25");
            int rodIsBest = 5000;
            System.out.println("Kritical Krit is the worst");

        }


    }
}
