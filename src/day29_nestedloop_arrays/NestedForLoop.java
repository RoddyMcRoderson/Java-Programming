package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int minutes = 1; minutes<=5; minutes++) {
            System.out.println("minutes = " + minutes);
            for(int seconds = 1; seconds <= 59; seconds++)
            System.out.println(minutes + ":"+seconds);
        }        }
    }

