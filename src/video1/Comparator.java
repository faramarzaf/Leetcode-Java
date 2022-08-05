package video1;

public class Comparator {


    public static void main(String[] args) {
        int max1 = findMax(1, 2, 3);
        int max2 = findMax(8, 5, 10);
        int max3 = findMax(10, 10, 10);
        int max4 = findMax(0, -2, 15);


        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        System.out.println(max4);
    }


    private static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

}
