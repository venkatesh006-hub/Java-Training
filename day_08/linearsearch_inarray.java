package day_8;

import java.util.Scanner;

public class linearsearch_inarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0;i<6;i++)
        {
            System.out.print("Enter a value:");
            int arr1 = sc.nextInt();
            arr[i] = arr1;
        }
        System.out.print("Enter your target value:");
        int target = sc.nextInt();
        System.out.println("Target value found in the index:"+ls(arr,target));
    }
    public static int ls(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
