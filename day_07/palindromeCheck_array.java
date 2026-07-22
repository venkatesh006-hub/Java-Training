package day_7;

import java.util.Scanner;

public class palindromeCheck_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        int[] arr3=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter a number:");
            int arr2=sc.nextInt();
            arr[i]=arr2;
        }
        System.out.println("Original array;");
        for(int ch:arr)
        {
            System.out.print(ch);
        }
        System.out.println();
        for(int i=0;i<5;i++)
        {
            arr3[i]=arr[arr.length-1-i];
        }
        System.out.println("Reversed Array:");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr3[i]);
        }
        System.out.println();
        boolean check = false;
        for(int i=0;i<5;i++)
        {
            if(arr[i]==arr3[i])
            {
                check=true;
            }
            else
            {
                check=false;
            }
        }
        if(check)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
