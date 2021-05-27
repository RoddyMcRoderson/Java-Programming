package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args){
        System.out.println(10+5);//15
        System.out.println(10+5-3);//12
        System.out.println(10-5+3);//8
        System.out.println(10-(5+3));//2

        System.out.println(2*3);//6
        System.out.println(2*3/3);//2

        System.out.println(20/(2*2));//20/4 ->5
//        System.out.println(10/0);  _> cannot divide by ZERO. error while code running
        System.out.println(2+5*3);//5*3=15+2 = 17
        System.out.println((2+5) * 3);//2+5=7*3=21

//Division by zero:
//        In Java, if you try to divide any number by zero. error will happen
//        during runtime.

        int num=10;
       // System.out.println(num/0);
        System.out.println(10/3);//3
        System.out.println(5/2);//2 it keeps the change and just keeps the whole number
        //INTEGER Division PROBLEM.
        //When you divide two whole numbers results is ALWAYS whole number, it does not ADD decimals
       //it will get rid of any remaining value.

       //If you need mathematical precision, NEVER divide integers/whole numbers.
       // Use decimal points number double or float.

       System.out.println(10.0/3.0);
        System.out.println(5.0/2.0);






    }
}
