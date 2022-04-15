package int_array;

import java.util.Arrays;

public class IntArray04 {

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {3, 2, 1}};
        int[][] nums2 = {{1, 5}, {7, 3}, {3, 5}};

        maximumWealth3(nums);
        maximumWealth3(nums2);

    }


    /**
     * Input: accounts = [[1,2,3],[3,2,1]]
     * Output: 6
     * Explanation:
     * 1st customer has wealth = 1 + 2 + 3 = 6
     * 2nd customer has wealth = 3 + 2 + 1 = 6
     * Both customers are considered the richest with a wealth of 6 each, so return 6.
     * <p>
     * Input: accounts = [[1,5],[7,3],[3,5]]
     * Output: 10
     * Explanation:
     * 1st customer has wealth = 6
     * 2nd customer has wealth = 10
     * 3rd customer has wealth = 8
     * The 2nd customer is the richest with a wealth of 10.
     */
    public static void maximumWealth(int[][] accounts) {
        // Initialize the maximum wealth seen so far(the minimum wealth possible)
        int max = 0;
        for (int i = 0; i < accounts.length; i++) { // Iterate over each accounts
            int sum = 0; // For each account, initialize the sum to 0
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j]; // Add the money in each bank
            }
            // Update the maximum wealth seen so far if the current wealth is greater than the current sum
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }

    public static void maximumWealth2(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts)
            maxWealth = Math.max(maxWealth, Arrays.stream(customer).sum());
        System.out.println(maxWealth);
    }

    public static void maximumWealth3(int[][] accounts) {
        int asInt = Arrays.stream(accounts)
                .mapToInt(customer -> Arrays.stream(customer).sum())
                .max()
                .getAsInt();
        System.out.println(asInt);
    }

    /**
     * Input: nums = [12,345,2,6,7896]
     * Output: 2
     * Explanation:
     * 12 contains 2 digits (even number of digits).
     * 345 contains 3 digits (odd number of digits).
     * 2 contains 1 digit (odd number of digits).
     * 6 contains 1 digit (odd number of digits).
     * 7896 contains 4 digits (even number of digits).
     * Therefore only 12 and 7896 contain an even number of digits.
     */
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int  i = 0; i<nums.length; i++){
            Integer num = nums[i];
            int len = num.toString().length();
            if (len % 2 == 0){
                count++;
            }
        }
        return count;
    }

}