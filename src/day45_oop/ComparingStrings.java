package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; // create in string pool
        String word2 = "java"; // re-use from string pool
        String word3 = new String ("java"); //create in HEAP, outside String pool
        String word4 = new String ("java");

        System.out.println(word2 == word1); // True
        System.out.println(word1 == word3); // False
        System.out.println(word3 == word4); //False -> point to different objects in HEAP

        System.out.println(word1.equals(word2)); //TRUE - comparing values
        System.out.println(word1.equals(word3)); //TRUE - comparing values
        System.out.println(word3.equals(word4)); //TRUE - comparing values
    }
}
