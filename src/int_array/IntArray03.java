package int_array;

import java.util.Arrays;

public class IntArray03 {
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4};
        int[] ints2 = {1, 1, 1, 1, 1};
        int[] ints3 = {3, 1, 2, 10, 1};
        int[] ints4 = {1, 0, 2, 3, 0, 4, 5, 0};

        //  runningSum(ints);
        //   runningSum2(ints);

        duplicateZeros(ints4);

    }


    /**
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */
    public static void runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            ans[i] = nums[i] + sum;
            sum = ans[i];
        }

        System.out.println(Arrays.toString(ans));
    }

    public static void runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }


    /**
     * Input: arr = [1,0,2,3,0,4,5,0]
     * Output: [1,0,0,2,3,0,0,4]
     * when reach zero duplicate that
     * <p>
     * Input: arr = [1,2,3]
     * Output: [1,2,3]
     */
    public static void duplicateZeros(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = nums.length - 1; j > i; j--) {
                    nums[j] = nums[j - 1];
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void duplicateZeros2(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int j;
                for (j = n - 2; j >= i + 1; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[j + 1] = 0;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }


}
