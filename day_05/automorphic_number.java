package day_5;

import java.util.Scanner;

public class automorphic_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isAutomorphic(n))
        {
            System.out.println(n + " is an automorphic number");
        }
        else
        {
            System.out.println(n + " is not an automorphic number");
        }
    }
    public static boolean isAutomorphic(int number) {
        int square = number * number;

        while (number > 0)
        {
            int lastDigitNumber = number % 10;
            int lastDigitSquare = square % 10;

            if (lastDigitNumber != lastDigitSquare)
            {
                return false;
            }

            number /= 10;
            square /= 10;
        }

        return true;
    }
}