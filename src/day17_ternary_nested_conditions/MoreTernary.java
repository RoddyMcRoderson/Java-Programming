package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "Pass" : "Fail";
        System.out.println("reply = " + reply);


        String todaysClass = "Java";
        String teacher = (todaysClass.equals("Java")) ? "Murodil & Saim" : "Nadir";
        System.out.println("Today's teacher(s) = " + teacher);

        boolean isEligibleToDrive = false;
        String driving = (isEligibleToDrive) ? "Has drivers license, can drive" : "No Drivers license, cannot drive";
        System.out.println("driving = " + driving);




    }
}
