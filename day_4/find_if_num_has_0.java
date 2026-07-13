package day_4;

import java.util.Scanner;

public class find_if_num_has_0
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        while(a!=0)
        {
            int pop = a%10;
            if(pop==0)
            {
                System.out.println("The number contains zero");
                break;
            }
            a/=10;
        }

    }
}
