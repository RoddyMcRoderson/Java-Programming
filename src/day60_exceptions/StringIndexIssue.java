package day60_exceptions;


public class StringIndexIssue {
    public static void main(String[] args) {
        String word = "java";
        try {
            System.out.println("word = " + word);
            System.out.println(word.charAt(10));
        } catch (Exception e) {
            System.out.println("Exception happened and caught");
            System.out.println("Reason + " + e.getMessage());
        }
    }
}
