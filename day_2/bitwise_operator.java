package day_2;

import java.util.Scanner;

public class bitwise_operator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int a = sc.nextInt();
        System.out.print("enter a number:");
        int b = sc.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
    }
}
