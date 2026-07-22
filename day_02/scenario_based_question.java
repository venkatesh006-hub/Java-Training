package day_2;
import java.util.*;
public class scenario_based_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int old_duck = 5;
        int egg_per_min = (old_duck / 5);
        System.out.println("Enter number of new ducks added:");
        int new_duck = sc.nextInt();
        int egg_per_min_after_more_ducks = ((new_duck) / 5);
        System.out.println(egg_per_min_after_more_ducks);
        int ans=((new_duck)*egg_per_min_after_more_ducks);
        System.out.println(ans);
    }
}
