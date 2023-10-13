package Exercises;

public class FactorialNumbers {
    public static void main(String[] args) {
        int product = 1;      // The accumulated product, init to 1
        int LOWERBOUND = 1;
        int UPPERBOUND = 10;
        System.out.println(factorialcalculator(1,15));
    }
        public static long factorialcalculator(long LOWERBOUND, long UPPERBOUND){
            long factorial = 1;
            for (long number = LOWERBOUND; number <= UPPERBOUND; number++){
                factorial *= number;
            } return factorial ;
        }
    }

