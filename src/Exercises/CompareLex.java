package Exercises;

public class CompareLex {
    public static void main(String[] args)
    {
        String s1 = "This is exercise 1";
        String s2 = "This is Exercise 1";

        if (s1.compareToIgnoreCase(s2)==0){
            System.out.println(s1 + " is equal to "+ s2);
        }else if(s1.compareToIgnoreCase(s2) < 0){
            System.out.println(s1 + "is less than " + s2);
        }else{
            System.out.println(s1 + "is greater than " + s2);
        }
    }
}
