package strings;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strings0 {


    public static void main(String[] args) {
        sumOfNonZeroElements2();
    }


    /**
     * LOKOMOTIVE ----> 1 ta 100,000 harchi 0 bud pak kon bad jame addad ha chand mishe
     * <p>
     * input:10078  output:79
     * input:20409  output:14
     */
    public static void sumOfNonZeroElements() {

    }


    // it is different from above
    /*
     * input:10078  --> 1+7+8 --> output:16
     * input:20409  output:2+4+9 --> output:15
     */
    public static void sumOfNonZeroElements2() {
        for (int i = 1; i < 30000; i++) {

            int i1 = Integer.parseInt(Integer.toString(i).replace("0", ""));
            String[] str1 = Integer.toString(i1).split("");

            int[] arr = Stream.of(str1).mapToInt(Integer::parseInt).toArray();
            int sum1 = IntStream.of(arr).sum();
            System.out.println("Was: "+i+" Array: " + Arrays.toString(str1) + "\t" + "--> sum:" + sum1);
        }
    }

    //https://leetcode.com/problems/truncate-sentence/
    //
}
