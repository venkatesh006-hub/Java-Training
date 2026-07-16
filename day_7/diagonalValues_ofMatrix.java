package day_7;

import java.util.Scanner;

public class diagonalValues_ofMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print("Enter value of:" + i + j + "-");
                int val = sc.nextInt();
                matrix[i][j] = val;
            }
        }
        System.out.println("Original");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Diagonal matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}
