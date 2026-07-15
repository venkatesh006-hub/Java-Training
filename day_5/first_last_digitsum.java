package day_5;

import java.util.Scanner;

public class first_last_digitsum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int last = n%10;
        while(n>=10)
        {
            n=n/10;
        }
        int first=n;
        System.out.println("Sum of first and last digit="+(first+last));

    }
}
