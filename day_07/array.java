package day_7;

import java.util.Scanner;

public class array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[] ch=new char[5];
        for(int i=0;i<5;i++)
        {
            char ch2=sc.next().charAt(0);
            ch[i]=ch2;
        }
        for(char ch3:ch)
        {
            System.out.println(ch3);
        }




    }
}
//        for(int i=0;i<5;i++)
//        {
//            System.out.println("Enter a name:");
//            String fill=sc.nextLine();
//