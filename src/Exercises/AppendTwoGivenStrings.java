package Exercises;

public class AppendTwoGivenStrings {
    public static void main(String[] args) {



        String str1 = "food";
        String str2 = "door";
        // Display the given strings and the concatenated string using the conCat method
        System.out.println("The given strings are: " + str1 + " and " + str2);
        System.out.println("The string after concatenation is: " + conCat(str1, str2));
    }
    public static String conCat(String st1, String st2) {

        if (st1.length() != 0 && st2.length() != 0 && st1.charAt(st1.length() - 1) == st2.charAt(0))
            return st1 + st2.substring(1);
        return st1 + st2;
    }
}
