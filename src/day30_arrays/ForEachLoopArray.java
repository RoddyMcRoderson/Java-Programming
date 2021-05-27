package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};
        for (int eachNum : data) {
            System.out.println(eachNum);
        }
        for (int n : data) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("------- FOR LOOP -------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("last vaue: " + data[data.length-1]);
    }
    }

