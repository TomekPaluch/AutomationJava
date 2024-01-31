package Exercises;

import java.util.Arrays;
import java.util.Scanner;
public class Matrix {

public static void main(String[] args) {
    System.out.println("Matrix before action");
    int matrix[][] = {
            {1,2,3,5,7},
            {4,5,6,10,11},
            {7,8,9,30,56},
            {4,2,3,5,6},
            {1,9,7,6,4}
    };
//    old_matrix_Array(matrix);
    array_to_string(matrix);
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size :");

    int partial_matrix = obj.nextInt();
    int partial_matrix1 = partial_matrix;
    new_matrix_Array(matrix, partial_matrix);
    System.out.print(save_matrix_new_Array(matrix,partial_matrix,partial_matrix1));
}
public static void old_matrix_Array(int matrix[][]){
    for (int i = 0; i < matrix.length; i ++){
        for (int j = 0; j < matrix[i].length; j++){
            System.out.print(matrix[i][j] + ", ");
        }
        System.out.println();
    }
}
public static void array_to_string(int matrix[][]){
    for (int [] row : matrix){
        System.out.println(Arrays.toString(row));
    }
}
public static void new_matrix_Array(int matrix[][],int partial_matrix){
    for (int i = 0; i < partial_matrix && i < matrix.length; i ++){
        for (int j = 0; j < partial_matrix && j < matrix[i].length; j++){
            System.out.print(matrix[i][j] + ", ");
        }
        System.out.println();
    }
}
public static int[][] save_matrix_new_Array(int matrix[][], int partial_matrix, int partial_matrix1){
//    int[][] subMatrix = new int[partial_matrix][partial_matrix1];
    int[][]subMatrix = new int[3][3];
    for (int i = 0; i < partial_matrix ; i ++){
        for (int j = 0; j < partial_matrix1 ; j++){
            subMatrix[i][j] = matrix[i][j];
        }
    }return subMatrix;
}
    public static void new_array_to_string(int matrix[][], int partial_matrix, int partial_matrix1){
    save_matrix_new_Array(matrix, partial_matrix,partial_matrix1);
        for (int [] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
