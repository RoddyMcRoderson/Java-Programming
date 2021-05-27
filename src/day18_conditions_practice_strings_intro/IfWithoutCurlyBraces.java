package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "java";
        if(todayClass.equals("python"))
            System.out.println("java is fun");
        else
            System.out.println("it is not java. it is " + todayClass);

        int score =1;
        if(score == 1) {
            System.out.println("lowest score 1");
        }else if (score == 2) {
            System.out.println("score 2");
        }else {
            System.out.println("invalid score");
        }
        score = 1;
        if (score > 0) {
            System.out.println("pass");
            System.out.println("your score is " + score);
        }else {
            System.out.println("fail");
            System.out.println("your score is " + score);
        }
        int a = 10;
        if (a == 1)
            System.out.println("a is 1");
            System.out.println("1 is a");


    }
}
