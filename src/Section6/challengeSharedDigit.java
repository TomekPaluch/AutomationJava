package Section6;

public class challengeSharedDigit {
    public static  void main(String[] args){
    System.out.println(hasSharedDigit(25, 42));
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        boolean firstNumber = num1 / 10 == num2 / 10 || (num1 / 10 == num2 % 10);
        boolean secondNumber = num1 % 10 == num2 / 10 || (num1 % 10 == num2 % 10);

        if (firstNumber || secondNumber) {
            return true;
        } else return false;
    }
}
