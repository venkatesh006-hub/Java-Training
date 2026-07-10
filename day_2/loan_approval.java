package day_2;
import java.util.*;
public class loan_approval {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter loan amount:");
        int amnt = sc.nextInt();
        System.out.print("Enter credit score:");
        float score = sc.nextInt();
        System.out.print((amnt>100000)&&(score>750));

    }
}
