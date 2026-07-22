package day_7;

import java.util.Scanner;

public class matrix_transpose
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][3];
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value of:" + i + j + "-");
                int val = sc.nextInt();
                matrix[i][j] = val;
            }
        }
        System.out.println("Original Matrix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
