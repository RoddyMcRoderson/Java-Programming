package day30_arrays;

import java.sql.SQLOutput;
import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        String[] student2 = {"MK4421", "Mike", "Bloomberg", "B22", "703-432-1234"};
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastname  = " + student1[2]);
        System.out.println("student1 batch num  = " + student1[3]);
        System.out.println("student1 mobile number = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FIL: data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("PASS: data array length match");
        } else {
            System.out.println("FAIL: data arays length mismatch");
        }
        System.out.println("Student name: " + student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));


        int[] nums = {33, 11, 66};
        for (int eachNum : nums) {
            System.out.println(eachNum);
        }
    }
}
