package Section5;

public class challengePositiveNegativeorZero {
    public static void  main(String[] args){
    checkNumber(0);
    checkNumber(14);
    checkNumber(-15);
    }
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0 ) {
            System.out.println("zero");

        }
    }
}
