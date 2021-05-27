package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String firstName = "intellij idea";
        System.out.println(firstName.startsWith("i"));
        System.out.println(firstName.startsWith("in"));
        System.out.println(firstName.startsWith("intellij"));
        System.out.println(firstName.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));
        System.out.println(firstName.startsWith("Int"));
        System.out.println(firstName.endsWith("idea"));
        System.out.println(firstName.endsWith("a"));


        firstName = "Dr. Nadir";
        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married Woman");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married Woman");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Single Woman");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("Normal name");
        }
        String url = "http://www.stackoverflow.com";
        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println("Russian Website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government Website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education Website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization Website");
        }
    }
}