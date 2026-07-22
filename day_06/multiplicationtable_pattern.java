package day_6;

public class multiplicationtable_pattern
{
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.printf("%4d", (i*j));
            }
            System.out.println();
        }
    }
}
