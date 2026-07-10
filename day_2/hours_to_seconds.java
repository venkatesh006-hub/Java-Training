package day_2;
import java.util.*;
public class hours_to_seconds {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours:");
        int h = sc.nextInt();
        int s = 3600*h;
        System.out.println(s);
    }
}
