package day_2;
import java.util.*;
public class avg_marks {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks 1:");
        int m1=sc.nextInt();
        System.out.print("Marks 2:");
        int m2=sc.nextInt();
        System.out.print("Marks 3:");
        int m3=sc.nextInt();
        System.out.print("Marks 4:");
        int m4=sc.nextInt();
        System.out.print("Marks 5:");
        int m5=sc.nextInt();
        float avg=(m1+m2+m3+m4+m5)/5;
        System.out.println(avg);
    }
}
