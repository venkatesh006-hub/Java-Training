package number_crunching;

import java.util.Scanner;

public class count_of_num {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        int rev = 0;
        int count = 0;
        while (a != 0)
        {
            int pop = a % 10;
            rev = rev * 10 + pop;
            a /= 10;
            count++;
        }
        System.out.println(count);
    }
}
