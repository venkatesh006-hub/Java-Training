package day_5;

import java.util.Scanner;

public class spy_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isSpy(n))
        {
            System.out.println(n + " is a spy number");
        }
        else
        {
            System.out.println(n + " is not a spy number");
        }
    }

    public static boolean isSpy(int number)
    {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0)
        {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }
}
