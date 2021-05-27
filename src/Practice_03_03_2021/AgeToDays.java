package Practice_03_03_2021;
/*
Make a class AgeToDays
create a main method

    - Declare two int variables: age and age in days

    - Use a base of 365 days in a year

    - Calculate and display:
        You are $age years old! That means you are $days days old

 */
public class AgeToDays {
    public static void main(String[] args) {


        int age = 32;
        int ageInDays = 365 * age;
        System.out.println("You are " + age + " years old! " +
                "That means you are " + ageInDays + " old");


        int num = 2;
        boolean b = true;

        switch (num) {
            case 0:
                b = false;
                case1:
                System.out.println(1);
            case 2:
                if (b) {
                    System.out.println(2);
                    b = false;
                } else {
                }
        }
    }
}