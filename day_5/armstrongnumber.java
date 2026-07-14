package day_5;

import java.util.Scanner;

public class armstrongnumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        int org=a;
        int sum=0;
        while(a!=0)
        {
            int pop = a%10;
            sum+=pop*pop*pop;
            a/=10;
        }
        if(sum==org)
        {
            System.out.println("Armstrong number.");
        }
        else
        {
            System.out.println("Not a Armstrong");
        }
    }
}
