package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
        //System.out.println("Break until 4:10pm est");
        int static2=22;
        int _static=22;
        int $tatic=44;
        int staticVar=234;
        int salary$=55;
        //int 1stMonthSalary=3000; -> cannot start with number
        int $=10;
        int _=3;
        System.out.println(_);
        System.out.println($);
        //above variables work but are not recommended.
        //we should use meaningful variable names
        int numbersOfFriends = 401;
        int number_of_friends = 401;

    }
}
