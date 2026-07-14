package day_5;

import java.util.Scanner;

public class neon_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isNeon(n))
        {
            System.out.println(n + " is a neon number");
        }
        else
        {
            System.out.println(n + " is not a neon number");
        }
    }

    public static boolean isNeon(int number)
    {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0)
        {
            int digit = square % 10;
            sumOfDigits += digit;
            square /= 10;
        }
        return sumOfDigits == number;
    }
}
