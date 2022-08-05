package video1;

public class ValidatorClass {

    public static void main(String[] args) {
        boolean a = isPasswordComplex("asdad");
        boolean b = isPasswordComplex("ASDAD");
        boolean c = isPasswordComplex("AsDAD");

        boolean a2 = isPasswordComplex("asdad4");
        boolean b2 = isPasswordComplex("ASDAD5");
        boolean c2 = isPasswordComplex("AsDAD2");


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
    }

    private static boolean isUpperCase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    private static boolean isPasswordComplex(String s){
        boolean a = s.chars().anyMatch(Character::isUpperCase);
        boolean b = s.chars().anyMatch(Character::isLowerCase);
        boolean c = s.chars().anyMatch(Character::isDigit);
        return a && b && c;
    }


}
