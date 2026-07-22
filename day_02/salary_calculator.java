package day_2;
import java.util.*;
public class salary_calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your day salary");
        int s = sc.nextInt();
        int month = s*30;
        int year = month*12;
        System.out.println("Monthly:"+month);
        System.out.println("Yearly:"+year);

    }
}
