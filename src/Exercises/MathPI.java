package Exercises;

public class MathPI {
    public static void main( String[] args){
        System.out.println("i/t Pi");
        int count = 10000;
        double pi = 0;
        double denominator = 1;
        while(count < 100000){
            for (int x = 0; x < count; x++) {

                if (x % 2 == 0) {
                    pi = pi + (1 / denominator);
                }
                else {
                    pi = pi - (1 / denominator);
                }
                denominator = denominator + 2;
            }
            pi = pi * 4;
            System.out.println(pi);
            count = count + 10000;
            System.out.println(count);
        }
    }
}

