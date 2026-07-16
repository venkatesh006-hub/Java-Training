package day_7;

import java.util.Scanner;

public class sumandavg_ofarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        float avg=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter a value:");
            int insertion = sc.nextInt();
            arr[i]=insertion;
        }
        for(int b:arr)
        {
            sum+=b;
        }
        System.out.println("Sum is:"+sum);
        avg=sum/arr.length;
        System.out.println("Average is:"+avg);
    }
}
