package video1;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5, 6})));
        rotateLeft(new int[]{1, 2, 3, 4, 5, 6});
        rotateRight(new int[]{1, 2, 3, 4, 5, 6});

    }

    private static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    private static void rotateLeft(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateRight(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }

}
