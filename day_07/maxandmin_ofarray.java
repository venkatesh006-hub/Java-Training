package day_7;

import java.util.Scanner;

public class maxandmin_ofarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter a number:");
            int insertion = sc.nextInt();
            arr[i]=insertion;
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Max is:"+max);
        System.out.println("Min is:"+min);

    }
}
