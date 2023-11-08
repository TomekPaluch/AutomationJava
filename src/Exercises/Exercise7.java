package Exercises;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the size :");

        int userName = myObj.nextInt();

        for (int i = 1;i <= userName; i++){
            if(i % 2 == 0){
                for(int j= 0;j<userName; j++){

                    System.out.print("# ");
                }
            }else {
                for(int j= 0;j<userName; j++){
                    System.out.print(" #");
                }
            }

            System.out.println();
        }
    }
}
