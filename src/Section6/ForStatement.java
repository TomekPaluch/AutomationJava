package Section6;

public class ForStatement {
    public static void main(String[] args){
        for (int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }
        for (double rate = 2.0; rate <= 5.0 ; rate ++){
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("Interest for 10000 " + rate + " Interest = " + interestAmount);
        }
        for (double i = 7.5; i <= 10; i += 0.25){
            double interestAmount = calculateInterest(100.00, i);
            System.out.println("Interest for 10000 " + i + " Interest = " + interestAmount);
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
