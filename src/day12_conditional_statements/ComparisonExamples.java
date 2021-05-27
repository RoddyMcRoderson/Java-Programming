package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("currentSpeed = " + currentSpeed +"mph");
        System.out.println("speedLimit = " + speedLimit + "mph");
        System.out.println("Are you speeding? " + isSpeeding);


        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("currentSpeed = " + currentSpeed +"mph");
        System.out.println("speedLimit = " + speedLimit + "mph");
        System.out.println("Are you speeding? " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 100;
        boolean canIaffordIt = itemPrice <= accountBalance;
        System.out.println("accountBalance = " + accountBalance);
        System.out.println("itemPrice = " + itemPrice);
        System.out.println("Can i afford it? " + canIaffordIt);
        accountBalance -= itemPrice;
        System.out.println("accountBalance = " + accountBalance);
        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);


    }
}
