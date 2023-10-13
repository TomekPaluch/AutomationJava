package Exercises;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 10;
//        System.out.println("The sum of 1 to 100 is " + firsttask(1, 100));
//        System.out.println("The average is " + average(firsttask(lowerbound, upperbound), upperbound));
//        System.out.println(firstWhileLopp(lowerbound, upperbound));
//        System.out.println(doWhileLoop(lowerbound, upperbound));
//        System.out.println(sumofsquares(1, 10));
        System.out.println(sumofodandevennumbers(1,100));
    }

    public static int firsttask(int lowerbound, int upperbound) {
        int sum = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            sum += number;
        }
        return sum;
    }

    public static double average(int sum, int divider) {
        double sum1;
        double sum2;
        sum1 = sum * 1.0;
        sum2 = divider * 1.0;
        return sum1 / sum2;
    }

    public static int firstWhileLopp(int lowerbound, int upperbound) {
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound) {
            sum += number;
            number++;
        }
        return sum;
    }

    public static int doWhileLoop(int lowerbound, int upperbound) {
        int sum = 0;
        int number = lowerbound;
        do {
            sum += number;
            number++;
        } while (number <= upperbound);
        return sum;
    }

    public static int sumofsquares(int lowerbound, int upperbound) {
        int sum = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            sum += number * number;
        }
        return sum;
    }

    public static int sumofodandevennumbers(int lowerbound, int upperbound) {
        int sumodd = 0;
        int sumEven = 0;
        int absDiff = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumodd += number;
            }
        if (sumEven > sumodd){
            absDiff = sumEven - sumodd;
        }else{
            absDiff = sumodd -sumEven;

        }

        }return absDiff;
    }
}




