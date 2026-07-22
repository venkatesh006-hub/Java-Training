package day_3;

import java.util.Scanner;

public class Equal_or_notequal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print("Enter a number:");
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}
