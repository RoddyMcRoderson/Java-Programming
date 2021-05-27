package day10_shorthand_operators;
import java.sql.SQLOutput;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather1 = scan.nextLine();
        System.out.println(weather1 + ", it's a nice day!");

        double rent = scan.nextDouble();
        String month = scan.nextLine();

        System.out.println(rent);
        System.out.println(month);



    }
}
