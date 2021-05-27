package day19_class_vs_object_strings;
import java.util.Scanner;
public class LoginTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String expUserName = "cybertek";
        String expPassword = " Abc123";
        System.out.println("Username:");
        String username = scan.next();
        String password = scan.next();

        if (expUserName.equalsIgnoreCase(username) && expPassword.equals(password)) {
            System.out.println("Pass - user successfully logged in");
        }else {
            if (!expUserName.equalsIgnoreCase(username)){
                System.out.println("Fail ");
            }
        }


    }
}
