package int_array;

import java.util.Arrays;

public class IntArray07 {

    public static void main(String[] args) {
        fibo();
    }
    public static void fibo() {
        int[] ints = new int[10];
        ints[0] = 1;
        ints[1] = 2;
        for (int i = 2; i < ints.length; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        System.out.println(Arrays.toString(ints));
    }
}
