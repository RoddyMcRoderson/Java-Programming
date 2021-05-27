package day38_methods;

public class ArraysUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 90};
        ArraysUtils.printArray(nums);
        ArraysUtils.printArray(new int[]{23, 64, 23, 534, 234, 45, 234, 45});
        System.out.println("sum = " + ArraysUtils.sum(nums));
        System.out.println("sum = " + ArraysUtils.sum(new int[]{23, 64, 23, 534, 234, 45, 234, 45}));

        int[] nums2 = {4, 1, 5, 8};

        System.out.println("5 - found = " + ArraysUtils.contains(nums2, 5));
        System.out.println("10 - found = " + ArraysUtils.contains(nums2, 10));
    }
}

