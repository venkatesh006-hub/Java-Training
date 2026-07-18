package day_8;

import java.util.Scanner;

public class Lsearch_inStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String");
        String name = sc.nextLine();
        char[] name1 = name.toCharArray();
        System.out.print("Enter the target character to find:");
        char target = sc.next().charAt(0);
        if (ls(name1, target) != -1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("The target integer found at:");
        }
    }

    public static int ls(char[] arr, char n)
    {
        int index=0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == n)
            {
                index=i;
            }
            index=-1;
        }
        return index;
    }
}
