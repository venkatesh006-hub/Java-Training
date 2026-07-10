package day_2;

import java.util.*;

public class Arithmetic_operator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print("Enter a number:");
        int b = sc.nextInt();

        int c=a+b;
        System.out.println("Addition:"+c);
        int d=a-b;
        float e=a/b;
        int f=a*b;
        int g=a%b;
        System.out.println("Subtraction:"+d);
        System.out.println("Multiplication:"+f);
        System.out.println("Division:"+e);
        System.out.println("Modulo:"+g);
        a++;
        System.out.println("Post Increment:"+a);
        ++a;
        System.out.println("Pre Increment"+a);


    }
}
