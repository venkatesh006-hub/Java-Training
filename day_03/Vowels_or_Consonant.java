package day_3;

import java.util.Scanner;

public class Vowels_or_Consonant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number b/w 65-90 and 97-122:");
        int a = sc.nextInt();
        int b = (char)a;
        System.out.println((char)b);
        switch(a)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
