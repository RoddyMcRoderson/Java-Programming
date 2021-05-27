package day12_conditional_statements;

public class CompareChar {
    public static void main(String[] args) {
        char letter1 = 'R';
        char letter2 = 'E';
        System.out.println(letter1 == letter2); //82 == 69
        System.out.println(letter1 > letter2); // 82 > 69
        System.out.println(letter1 < letter2);//82 < 69

        char grade = 'E';
        boolean  pass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + pass);






    }
}
