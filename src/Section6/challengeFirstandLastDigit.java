package Section6;

public class challengeFirstandLastDigit {
    public static  void main(String[] args){
        System.out.println(sumFirstAndLastDigit(254));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        sum = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        sum += number % 10;
        return sum;
    }
}
