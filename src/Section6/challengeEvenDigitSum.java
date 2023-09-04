package Section6;

public class challengeEvenDigitSum {
    public static  void main(String[] args){
    System.out.println(getEvenDigitSum(129));
    }
//    public static int getEvenDigitSum(int number){
//        if (number < 0){
//            return -1;
//        }
//        int sum = 0;
//        int remainder = 0;
//        while (number > 0){
//            sum = sum + number %10;
//            number = number / 10;
//
//            if ( sum % 2 == 0 ){
//                sum += sum;
//            }
//        }
//        System.out.println();
//        return sum;
//    }
    public static int getEvenDigitSum (int number){

        if (number < 0){
            return -1;
        }
        int evenNumbers = 0;
        int extractedNumbers = 0;
        int sum = 0;

        while (number > 0){
            extractedNumbers = number % 10;
            if (extractedNumbers % 2 == 0){
                evenNumbers = extractedNumbers;
                sum += evenNumbers;
            }
            number /= 10;
        }

        return sum;
    }
}
