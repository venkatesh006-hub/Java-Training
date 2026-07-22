package day_5;

import java.util.Scanner;

public class strongnumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if (isStrong(n)) {
            System.out.println("Strong number");
        } else
        {
            System.out.println("Not a strong number");
        }
    }

        public static boolean isStrong(int num)
        {
            int sum = 0;
            int temp = num;
            while (num != 0)
            {
                int pop = num % 10;
                sum += fact(pop);
                num /= 10;
            }
            return sum==temp;
        }
        public static int fact(int n)
        {
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact *= i;
            }
            return fact;
        }
}

