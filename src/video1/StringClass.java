package video1;

public class StringClass {
    public static void main(String[] args) {

        System.out.println(reverseEachWord("hello i am faramarz"));

    }


    // hello -> olleh
    private static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        //
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }


    private static String reverseEachWord(String s) {
        if (s == null || s.isEmpty())
            return "";

        String[] split = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            stringBuilder.append(reverse(split[i]));
            if (i != split.length - 1) stringBuilder.append(" ");// we dont want add space for last word
        }
        return stringBuilder.toString();
    }
}
