package video1;

import java.util.HashMap;

public class MapClass {

    public static void main(String[] args) {

        HashMap<Integer, Integer> hashMap = countItems(new int[]{1, 2, 3, 4, 5, 6, 6, 6, 6});
        System.out.println(hashMap);
    }


    // counts how many of each items exist in array?
    private static HashMap<Integer, Integer> countItems(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        return map;
    }

}
