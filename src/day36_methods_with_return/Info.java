package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        fullName();
        isMarried();
        getAge();
        System.out.println("Full name = " + fullName());
        System.out.println("isMarried = " + isMarried());
        System.out.println("Age = " + getAge());
        getRandomYear();
        System.out.println(getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
    }
    public static String fullName(){
       // System.out.println("inside fullName method");
        return "Rodrigo Escobar";
    }
    public static boolean isMarried(){
        return true;
    }
    public static int getAge(){
        int age = 32;
        return age;
    }

    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

}
