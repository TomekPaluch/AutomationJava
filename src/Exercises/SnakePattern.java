package Exercises;

import java.util.Scanner;

public class SnakePattern {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size :");
        int matrixValue = obj.nextInt();
        int matrix[][]=new int[matrixValue][matrixValue];
        int i,j,k,l;
        int direction=1;
        int maxValueOfMatrix = matrixValue * matrixValue;
        for(i=1,j=0,k=0;i<=maxValueOfMatrix;i++){// this loop is used to set pattern
            matrix[j][k]=i;

            switch(direction){
                case 1:if(k+1<matrixValue){
                    if(matrix[j][k+1]==0){
                        k++;    // if direction=1 and matrix[j][k+1]=0
                        continue;
                    }
                    else{

                        j++;    // if direction=1 and matrix[j][k+1]!=0

                        direction=2;
                        continue;
                    }
                }

                else{
                    j++;    // if k+1 is not smaller than 10
                    direction=2;
                    continue;
                }




                case 2:if(j+1<matrixValue){

                    if(matrix[j+1][k]==0){
                        j++;    //if direction=2 and matrix[j+1][k]=0
                        continue;
                    }
                    else{
                        direction=3;
                        k--;    //if direction=2 and matrix[j+1][k]!=0
                        continue;
                    }
                }
                else{
                    direction=3;
                    k--;    //j+1 is not smaller than 10
                    continue;
                }




                case 3:if(k-1>=0){
                    if(matrix[j][k-1]==0){

                        k--;    // if direction=3 and matrix[j][k-1]=0
                        continue;
                    }
                    else{
                        direction=4;
                        j--;    // if direction=3 and matrix[j][k-1]!=0
                        continue;
                    }
                }
                else{
                    direction=4;
                    j--;    //k-1 is not greater than -1
                    continue;
                }





                case 4:if(j-1>=0){
                    if(matrix[j-1][k]==0){

                        j--;    //if direction=4 and matrix[j-1][k]=0
                        continue;
                    }
                    else{
                        k++;    //if direction=4 and matrix[j-1][k]!=0
                        direction=1;
                        continue;
                    }
                }
                else{
                    k++;    //if j-1 is not greater than -1
                    direction=1;
                    continue;
                }



            }
        }



        System.out.println("Matrix after snake=\n");
        for(i=0;i<matrixValue;i++){  //this loop is used to print one line of matrix
            for(j=0;j<matrixValue;j++){       //this loop is used to print one element
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}

