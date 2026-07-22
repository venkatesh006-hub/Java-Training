package day_7;

import java.util.Scanner;

public class evenoddsum_usingarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter a number:");
            int a = sc.nextInt();
            arr[i]=a;
        }

        int evensum=0;
        int oddsum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evensum+=arr[i];
            }
            else
            {
                oddsum+=arr[i];
            }
        }
        System.out.println("Evensum:"+evensum);
        System.out.println("Oddsum:"+oddsum);
    }
}
