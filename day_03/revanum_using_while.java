package day_3;

import java.util.Scanner;

public class revanum_using_while
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        int rev = 0;
        while (a != 0)
        {
            int pop = a % 10;
            rev = rev * 10 + pop;
            a /= 10;
        }
        System.out.println(rev);
    }
}

