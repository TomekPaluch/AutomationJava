package Section6;

public class Exercise23 {
    public static void main(String[] args){
    isPerfectNumber(6);
    }
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        if (number < 1) {
            System.out.println("false");
            return false;
        }

        for (int i = 1; i < number; i++)
            if (number % i == 0) {
                sum += i;
            }
        if (number == sum) {
            System.out.println("true - perfect number");
            return true;
        } else {
            System.out.println("false - not perfect number");
            return false;
        }

    }
}
