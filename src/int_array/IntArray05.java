package int_array;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntArray05 {
    public static void main(String[] args) {

        String[] op1 = {"--X", "X++", "X++"};
        String[] op2 = {"++X", "++X", "X++"};
        String[] op3 = {"X++", "++X", "--X", "X--"};



        int[] num = {8,1,2,2,3};
        int[] num2 = {4,0,1,1,3};


 /*       finalValueAfterOperations(op1);
        finalValueAfterOperations(op2);
        finalValueAfterOperations(op3);*/

        smallerNumbersThanCurrent(num);
    }

    /**
     * Initially, the value of X is 0.
     * Input: operations = ["--X","X++","X++"]
     * Output: 1
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * --X: X is decremented by 1, X =  0 - 1 = -1.
     * X++: X is incremented by 1, X = -1 + 1 =  0.
     * X++: X is incremented by 1, X =  0 + 1 =  1.
     */
    public static void finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }

    public static void finalValueAfterOperations2(String[] operations) {
        int count = 0;

        for (String middle : operations) {
            if (middle.charAt(1) == '+') {
                count++;
            } //it is only necessary to check the middle character, as it covers any situation (x++, ++x, --x, x--)
            else {
                count--;
            }
        }
        System.out.println(count);
    }


    /***
     * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
     * Output: 6
     */
    public static void mostWordsFound(String[] sentences) {
        int asInt = Stream.of(sentences).mapToInt(s -> s.split(" ").length).max().getAsInt();
        System.out.println(asInt);
    }

    public static void mostWordsFound2(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            max = Math.max(max, (sentences[i].split(" ")).length);
        }
        System.out.println(max);
    }


    /**
     * Input: nums = [8,1,2,2,3]
     * Output: [4,0,1,1,3]
     * Explanation:
     * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
     * For nums[1]=1 does not exist any smaller number than it.
     * For nums[2]=2 there exist one smaller number than it (1).
     * For nums[3]=2 there exist one smaller number than it (1).
     * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
     */
    public static void smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            int currentNum = nums[i];
            for (int k = 1; k < nums.length; k++) {

                if (currentNum > nums[k]) {
                    count++;
                    //max = Math.max(max, count);
                    arr[i] = count;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
