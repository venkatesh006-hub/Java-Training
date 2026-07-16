package day_7;

public class swapping_AnArray
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int[] arr2=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[arr.length-1-i];
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(arr2[i]);
        }
    }
}