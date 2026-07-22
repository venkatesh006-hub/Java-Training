package day_5;
import java.util.Scanner;
public class find_evenorodd_sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        int oddsum=0;
        int evensum=0;
        while(a!=0)
        {
            int pop=a%10;
            if((pop%2)==0)
            {
                evensum+=pop;
            }
            else
            {
                oddsum+=pop;
            }
            a/=10;
        }
        System.out.println("OddSum:"+oddsum);
        System.out.println("EvenSum:"+evensum);
    }
}
