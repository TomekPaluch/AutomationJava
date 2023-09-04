package Section6;

public class Exercise26 {
    public static void main(String[] args){
    System.out.println(getLargestPrime(217));
    }
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        int i = 1;
        int j = number;
        int k = 0;
        while(i <= number / 2){
            while (j % i == 0){
                j /=i;
                k = i;
            }
            i++;
        }
        if(k != 0){
            return k;
        }
        else{
            return number;
        }
    }
}
