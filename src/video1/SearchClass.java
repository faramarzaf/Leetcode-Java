package video1;

public class SearchClass {

    public static void main(String[] args) {

       /* System.out.println(atEvenIndex("sorem", 's'));
        System.out.println(atEvenIndex("myname", 'y'));
        System.out.println(atEvenIndex("heSSR", 'R'));*/
        // System.out.println(linearSearch(new int[]{1, 2, 3}, 3));


        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
        System.out.println(binarySearch2(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, 9));

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

    private static boolean binarySearch(int[] arr, int item) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (arr[mid] == item) return true;

            else if (item < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    private static boolean binarySearch2(int[] arr, int item) {// desc order of input
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (item == arr[mid]) return true;
            else if (item < arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
