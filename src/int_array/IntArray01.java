package int_array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArray01 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {4, 1, 0, 3, 5, 2};

        int[] nums4 = {1, 1, 0, 1, 1, 1};
        int[] nums5 = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};


        //reversePrintArray(nums);
        //printArrays(nums2);
        //System.out.println(Arrays.toString(getFirstAndLastItem(nums)));
        //getSum(nums3);
        // System.out.println(getAvg(nums));

        // sortedSquares(nums3);

/*        shiftZeroToEnd(nums3);
        shiftZeroToEnd(nums4);
        shiftZeroToEnd(nums5);*/


        //  buildArray(nums3);

       /* shiftZeroToStart(nums);
        shiftZeroToStart(nums2);
        shiftZeroToStart(nums3);
        shiftZeroToStart(nums4);
        shiftZeroToStart(nums5);*/

    }

    /**
     * Input: nums = [-4,-1,0,3,10]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     */
    public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] * nums[i]);
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        /**
         *     Given a binary array nums, return the maximum number of consecutive 1's in the array.
         *     Input: nums = [1,1,0,1,1,1]
         *     Output: 3
         *
         *     Input: nums = [1,0,1,1,0,1]
         *     Output: 2
         */

        int count = 0; //initialize count
        int result = 0; //initialize max

        for (int i = 0; i < nums.length; i++) {

            // Reset count when 0 is found
            if (nums[i] == 0)
                count = 0;

                // If 1 is found, increment count
                // and update result if count becomes
                // more.
            else {
                count++;//increase count
                result = Math.max(result, count);
            }
        }

        return result;
    }


    /**
     * Input: nums = [0,2,1,5,3,4]
     * Output: [0,1,2,4,5,3]
     * Explanation: The array ans is built as follows:
     * <p>
     * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
     * = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
     * = [0,1,2,4,5,3]
     */
    public static void buildArray(int[] nums) {
        //todo why if int[] ans dont exist answer is wrong???
        /*
        It is because otherwise you would modify the num array. You don’t want to do this,
        because you still need to know what the start values where in the array. [0, 2, 1, 5, 3, 5]
        For example, at the start nums[nums[2]] = 2. Because nums[2] = 1  so nums[1] = 2
        But because you set nums[1] = 1 you get nums[nums[2]] = 1. Because nums[2] = 1 so nums[1] = 1
         */
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
            System.out.println(ans[i]);
        }
        System.out.println(Arrays.toString(ans));
    }


    public static void buildArray2(int[] nums) {
        int[] ints = Arrays.stream(nums)
                .map(num -> nums[num])
                .toArray();
        System.out.println(Arrays.toString(ints));
    }


    //  {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1}   -->  [0, 1, 1, 1, 1, 1]
    private static void shiftZeroToStart(int[] nums) {
        int current = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[current] = nums[i];
                current--;
            }
        }
        while (current >= 0) {
            nums[current] = 0;
            current--;
        }
        System.out.println(Arrays.toString(nums));
    }


    //  {4, 1, 0, 3, 5, 2}   -->  {0,4,1,3,5,2}
    private static void shiftZeroToStart2(int[] nums) {
        long zeros = Arrays.stream(nums).filter(num -> num == 0).count();
        int[] nonZeroArr = Arrays.stream(nums).filter(num -> num != 0).toArray();
        int[] zeroArray = new int[(int) zeros];
        int[] merged = IntStream.concat(IntStream.of(zeroArray), IntStream.of(nonZeroArr)).toArray();
        System.out.println(Arrays.toString(merged));
    }

    // {1, 4, 0, 2}
    private static void shiftZeroToEnd2(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int k = index; k < nums.length; k++) {
            nums[k] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    //{1, 4, 0, 2}

    /**
     * nums[0] --> 1
     * nums[1] --> 4
     * nums[2] --> 2
     */
    private static void shiftZeroToEnd(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {// we will shift all the non zero values to right
                nums[index] = nums[i];
                index++;// keep on increasing the index as well
            }
        }
        //3-4
        for (int i = index; i < nums.length; i++) { //now we will replace all the remaining indexes with zero
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }


    public static double getExecutionTime(long startTime, long stopTime) {
        long elapsedTime = stopTime - startTime;
        return (double) elapsedTime / 1_000_000_000.0;
    }
}
