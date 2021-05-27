package day20_string_manipulation;
public class StringContains {
    public static void main(String[] args) {
        String company = " Capital One";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company");
        }

        String estyTitle = "Wooden Spoon | Etsy";
        if (estyTitle.contains(" | ")) {
            System.out.println("Pass - title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }
        String firstName = "Rodrigo";
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("error try again");
        } else {
            System.out.println("Rodrigo WOOT WOOT!");
        }

        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        } else {
            System.out.println("nor a or i is present");
        }
        String email = "Rodesco89@gmail.com";
        if (email.contains("@") || email.endsWith(".com")) {
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }
        if(email.toLowerCase().contains("d")){
            System.out.println("");

        }
    }
}
