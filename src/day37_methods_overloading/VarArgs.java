package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23,45, 23, 54, 23,135, 51, 51, 1, 5, 1, 3,  51, 5, 1 );
        addNumbers();

        //int... myNumber = 10, 4; ERROR, var-args can ONLY be used as a method parameter

    }


    public static void addNumbers(int... nums){
        int sum =0;
        for(int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
