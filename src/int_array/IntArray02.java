package int_array;

import java.util.Arrays;

public class IntArray02 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {4, 1, 0, 3, 5, 2};

        int[] nums4 = {1, 1, 0, 1, 1, 1};
        int[] nums5 = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};


    }

    private static void printArrays(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void reversePrintArray(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }


    private static int[] getFirstAndLastItem(int[] nums) {
        int lastItem = nums[nums.length - 1];
        int firsItem = nums[0];
        return new int[]{firsItem, lastItem};
    }


    private static void getSum(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i] + x;
        }
        System.out.println(x);
    }

    private static void getAvg(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i] + x;
        }
        System.out.println(x / nums.length);
    }

    private static int getMaxWithSort(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    private static int getMinWithSort(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    //{8,3,5}
    private static int getMax(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    private static int getMin(int[] nums) {
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

}
