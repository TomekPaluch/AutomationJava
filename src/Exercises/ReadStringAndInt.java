package Exercises;

public class ReadStringAndInt {
    public static void main(String[] args) {

        String str1 = "Welcome";
        int n1 = 3;


        System.out.println("The given strings is: " + str1);
        System.out.println("The given numbers is: " + n1);
        System.out.println("The new string is: " + nTwice(str1, n1));
    }
    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring((str.length() - n));
    }
}
