package day_2;
import java.util.*;
public class TEMPARATURE_CONVERSION {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter celsius:");
            float c = sc.nextFloat();
            float F=((c*9/5)+32);
            System.out.println(F);
        }
    }



