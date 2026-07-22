package day_3;

import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print("Enter a number:");
        int b = sc.nextInt();
        System.out.print("Enter a operation to perform:");
        char c = sc.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println("Addition is:"+(a+b));
                break;
            case '-':
                System.out.println("Subtraction is:"+(a-b));
                break;
            case '*':
                System.out.println("Multiplication is:"+(a*b));
                break;
            case '/':
                System.out.println("Division is:"+(a/b));
                break;
            case '%':
                System.out.println("Modulo is:"+(a%b));
                break;
            default:
                System.out.println("Invalid");
        }
    }
}