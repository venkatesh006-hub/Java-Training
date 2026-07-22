package day_3;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        while (a > 0) {
            System.out.println(a);
            a--;
        }
    }
}
