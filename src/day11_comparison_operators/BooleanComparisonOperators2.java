package day11_comparison_operators;

public class BooleanComparisonOperators2 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 3;
        System.out.println(n1 == n2);

        boolean check = n1 == n2;
        System.out.println(check);

        boolean check2 = n1 > n2;
        System.out.println(check2);

        int age = 2;
        boolean noMoreToddler = age > 3;
        System.out.println(noMoreToddler);

        age = 66;
        boolean seniorCitizen = age >= 65;
        System.out.println("is senior citizen? -" + seniorCitizen);




    }
}
