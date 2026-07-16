package day_7;

import java.util.Scanner;

public class MATRIX_addition_2darray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1=new int[3][3];
        int[][] matrix2=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Enter:"+i+j+"=");
                int val = sc.nextInt();
                matrix1[i][j]=val;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Enter:"+i+j+"=");
                int val=sc.nextInt();
                matrix2[i][j]=val;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int max = matrix1[i][j]+matrix2[i][j];
                System.out.print(max+" ");
            }
            System.out.println();
        }
    }
}
