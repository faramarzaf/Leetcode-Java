package int_array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArray06 {

    public static void main(String[] args) {
   /*     String[] s = {"codeleet", "asd", "xcvxcv", "asdad546as48d", "asdasdasdadasd", "c"};
        int[] arr = {4, 5, 6, 7, 0, 2, 1, 3};
        getMaxLength(s);*/


        /*String[] s1 = {"ab", "c"};
        String[] s2 = {"a", "bc"};
        arrayStringsAreEqual(s1, s2);
        */

        int[] arr = {1, 4, 2, 5, 3};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {1, 1};//here bug not should be 4 in result it should be 2
        int[] arr4 = {1};//here bug not should be 2 in result it should be 1
        int[] arr5 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        sumOddLengthSubArrays(arr);


    }

    // get max length of string array
    public static void getMaxLength(String[] strings) {
        int max = 0;
        for (String string : strings) {
            int length = string.length();
            if (length > max) {
                max = Math.max(max, length);
            }
        }
        System.out.println(max);
    }


    /**
     * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
     * Output: true
     * Explanation:
     * word1 represents string "ab" + "c" -> "abc"
     * word2 represents string "a" + "bc" -> "abc"
     * The strings are the same, so return true.
     */
    public static void arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean ans;
        String answerS1 = "";
        String answerS2 = "";

        for (String s1 : word1) {
            answerS1 = answerS1.concat(s1);
        }
        for (String s2 : word2) {
            answerS2 = answerS2.concat(s2);
        }
        if (answerS1.equals(answerS2)) {
            ans = true;
            System.out.println(ans);
        }
    }

    public static void arrayStringsAreEqual2(String[] word1, String[] word2) {
        boolean equals = String.join("", word1).equals(String.join("", word2));
        System.out.println(equals);
    }


    //https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

    /**
     * Input: arr = [1,4,2,5,3]
     * Output: 58
     * Explanation: The odd-length subarrays of arr and their sums are:
     * [1] = 1
     * [4] = 4
     * [2] = 2
     * [5] = 5
     * [3] = 3
     * [1,4,2] = 7
     * [4,2,5] = 11
     * [2,5,3] = 10
     * [1,4,2,5,3] = 15
     * If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
     */
    public static void sumOddLengthSubArrays(int[] nums) {
        int length = nums.length;
        int[] arrOddLength = new int[length];//[1,4,2,5,3]

        for (int i = length; i > 0; i--) {
            if (i % 2 != 0) {
                arrOddLength[i - 1] = i;
            }
        }

        int[] clone = arrOddLength.clone();
        int[] clone2 = IntStream.of(arrOddLength).filter(value -> value != 0 && value != 1 && value != clone[length - 1]).toArray();
        System.out.println(Arrays.toString(clone2));
        System.out.println(Arrays.toString(clone));
        System.out.println(Arrays.toString(arrOddLength));

        int sum = Arrays.stream(nums).sum() * 2;
        System.out.println(sum);
        for (int n = 0; n < arrOddLength.length; n++) {
        }
    }

    public static void sumOddLengthSubarrays3(int[] arr) {
        int total = 0;

        for (int window = 1; window <= arr.length; window += 2)
            for (int i = 0; i + window <= arr.length; i++)
                for (int j = i; j < i + window; j++)
                    total += arr[j];
        System.out.println(total);
    }

}
