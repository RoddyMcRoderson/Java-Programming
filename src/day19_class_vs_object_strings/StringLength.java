package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String firstName = "Rodrigo";
        System.out.println("Number of letters in Rodrigo is: " + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "Abc123";
        if (password.length() >= 6) {
            System.out.println("Valid Amazon Password");
        } else {
            System.out.println("Invalid Amazon Password");
        }

    }
}
