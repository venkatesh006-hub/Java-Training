package day_4;

import java.util.Random;
import java.util.Scanner;

public class do_while_loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int key = rand.nextInt(100);
        int guess;
        do
        {
            System.out.print("Enter the value of your guess:");
            guess=sc.nextInt();
            if(guess>key)
            {
                System.out.println("Guess is too high");
            }
            else if(guess<key)
            {
                System.out.println("Guess is too low");
            }
        }
        while(key!=guess);
        {
            System.out.println("You guess it!");
        }
    }
}
