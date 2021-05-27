package day38_methods;

public class ArraysUtils {
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " | ");
        }
        System.out.println();
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }

    int[] nums2 = {4, 1, 5, 8};
    int num = 5;
    boolean found = false;

    public static boolean contains(int[] nums, int num) {
        boolean found = false;
        for (int each : nums) {
            if (each == num) {
                found = true;
                break;
            }
        }
        return found;
    }
}