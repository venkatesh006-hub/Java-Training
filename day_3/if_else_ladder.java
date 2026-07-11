package day_3;

import java.util.Scanner;

public class if_else_ladder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print("Enter a number:");
        int b = sc.nextInt();
        if (a > b)
        {
            System.out.println(a + " " + "is greater");
        }
        else if (a < b)
        {
            System.out.println(b + " " + "is greater");
        }
        else
        {
            System.out.println("They are equal");
        }
    }
}
