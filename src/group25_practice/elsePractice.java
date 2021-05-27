package group25_practice;

public class elsePractice {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        if (a + b == c || c + a == b || c + b == a) {
            ;
            System.out.println("Yes!");
        } else {
            System.out.println("No");
        }

        String ta = "A";
        ta = ta + "B";
        String tb = "C";
        ta = ta + tb;
        ta.replace('C', 'D');
        System.out.println(ta);
        }
    }
