package Exercises;

public class DivideString {
    public static void main(String [] arfg){
        String alphabet = "abcdefghijklmnopqrstuvwxy";
        int split = 5;
        splitString(alphabet, split);

    }
    public static void splitString(String str, int n){
        int str_size = str.length();
        int part_size;


        if (str_size % n != 0) {

            System.out.println("The size of the given string is not divisible by " + n);
            return;
        } else {

            System.out.println("The given string is: " + str);
            System.out.println("The string divided into " + n + " parts and they are: ");


            part_size = str_size / n;


            for (int i = 0; i < str_size; i++) {

                if (i % part_size == 0)
                    System.out.println();

                System.out.print(str.charAt(i));
            }
        }
    }
}
