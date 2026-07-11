package day_3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        int fact = 1;
        for (int i = a; i != 0; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
