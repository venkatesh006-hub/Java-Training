package day_2;

import java.util.*;
public class logical_Operator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print("Enter a number:");
        int b = sc.nextInt();
        System.out.println((a>5)&&(b>a));
        System.out.println((a>b)||(b>2));
        System.out.println(!(a<b));
    }
}
