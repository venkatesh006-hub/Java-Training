package day_7;

import java.util.Scanner;

public class evenoddsumwithdigit_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter a number:");
            int a = sc.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<5;i++)
        {
            int count=0;
            int org = arr[i];
            while(arr[i]!=0)
            {
                int pop = arr[i]%10;
                count++;
                arr[i]/=10;
            }
            if(count%2==0)
            {
                evensum+=org;
            }
            else
            {
                oddsum+=org;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
