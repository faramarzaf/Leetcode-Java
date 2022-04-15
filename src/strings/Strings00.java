package strings;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strings00 {


    public static void main(String[] args) {
        //  sumOfNonZeroElements2();
        reverse("eulb si yks eht");
    }


    public static void reverse(String s) {
        StringBuilder sb = new StringBuilder();
        String s1 = null;
        for (int i = s.length() -1; i >= 0; i--) {
            char c = s.charAt(i);
             s1 = sb.append(c).toString();
        }
        System.out.println(s1);
    }


    /**
     * Input: s = "the sky is blue"
     * Output: "blue is sky the"
     */
    public static void reverseWords(String s) {
        
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
            System.out.println("Was: " + i + " Array: " + Arrays.toString(str1) + "\t" + "--> sum:" + sum1);
        }
    }

    //https://leetcode.com/problems/truncate-sentence/
    //


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

}
