package video1;

import java.util.Arrays;

public class SearchClass {

    public static void main(String[] args) {

       /* System.out.println(atEvenIndex("sorem", 's'));
        System.out.println(atEvenIndex("myname", 'y'));
        System.out.println(atEvenIndex("heSSR", 'R'));*/
        System.out.println(linearSearch(new int[]{1, 2, 3}, 3));
    }

    private static boolean atEvenIndex(String s, char c) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i = i + 2) {
            if (s.charAt(i) == c)
                return true;
        }
        return false;
    }


    private static boolean linearSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item)
                return true;
        }
        return false;
    }

    // usually the input data is sorted
    private boolean binarySearch(int[] arr, int item) {
       return false;
    }
}
