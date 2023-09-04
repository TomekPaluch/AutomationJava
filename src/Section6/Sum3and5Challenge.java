package Section6;

public class Sum3and5Challenge {
    public static void main(String[] args){
        int sum = 0;
        int sumofmatches = 0;
        for (int i = 1; i <= 1000; i++){
            if ((i % 3 ==0 )&& (i % 5 == 0)){
                System.out.println("Numbers divided by 3 and 5 : " + i);
                sumofmatches+=i;
                sum++;
                }
            if (sum == 5){
                break;

            }
        }
    }

}
