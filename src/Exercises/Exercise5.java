package Exercises;

public class Exercise5 {
    public static void main(String[] args)
    {
        int number = 4526;

        reverse(number);
    }
    public static void reverse(int number) {
        int remainder = 0;
        while (number > 0) {

            // Finding the remainder (Last Digit)
            remainder = number % 10;

            // Printing the remainder/current last digit
            System.out.println(remainder);

            // Removing the last digit/current last digit
            number = number / 10;
        }
        System.out.println(number);
    }
}
