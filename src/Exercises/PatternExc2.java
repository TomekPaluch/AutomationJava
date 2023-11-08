package Exercises;

public class PatternExc2 {
    public static void main(String[] args)
    {

        int i;
        int j;
        int row = 8;

        for (i=0; i<row; i++)
        {

            for (j=2*(row-i); j>=0; j--)
            {

                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print((row - j) + " ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
