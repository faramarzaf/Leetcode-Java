package int_array;

import ints.Ints01;

import java.util.Arrays;

public class IntArray07 {

    public static void main(String[] args) {
        //  fibo(30);
        //circularPrimes();
    }

    public static void fibo(int n) {
        int[] ints = new int[n];
        ints[0] = 1;
        ints[1] = 2;
        for (int i = 2; i < ints.length; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        System.out.println(Arrays.toString(ints));
    }

    //below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
    // not completed
    public static void circularPrimes() {
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            if (Ints01.isPrime(arr[i])) {
            } else {
                arr[i] = 0;
            }
        }
        int[] primes = Arrays.stream(arr)
                .filter(value -> value != 0)
                .toArray();
        System.out.println(Arrays.toString(primes));
    }


}
