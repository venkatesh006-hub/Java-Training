package day_5;

import java.util.Scanner;

public class harshad_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHarshad(n))
        {
                System.out.println(n + " is a Harshad number");
        }
        else
        {
            System.out.println(n + " is not a Harshad number");
        }
    }
    public static boolean isHarshad(int number)
    {
        int sumOfDigits = 0;
        int temp = number;
        while (temp > 0)
        {
            int digit = temp % 10;
            sumOfDigits += digit;
            temp /= 10;
        }
        if (sumOfDigits == 0)
        {
            return false;
        }
        return number % sumOfDigits == 0;
    }
}
