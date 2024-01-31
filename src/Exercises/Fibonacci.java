package Exercises;

public class Fibonacci {
    public static void main(String[] args) {
        int fib = 20;
        System.out.println("Average is " + fibonacci_numbers(20));

    }

    public static int fibonacci_numbers(int n) {
        int f1 = 1;
        int f2 = 1;
        System.out.print(f1 + " ");
        if (n < 1)
            return 0;

        int avg = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
            avg += f2;
        }
        System.out.println("");
        return ((avg) / (n));
    }
}