package Exercises;

public class PatternExc2 {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--){
                System.out.print(k + "");
            }
            System.out.println();
        }
    }
}
