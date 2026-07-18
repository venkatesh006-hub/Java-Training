package day_8;

public class seachingUsing2d_ARRAY
{
    public static void main(String[] args)
    {
        int[][] name1={{1,2,3,},{4,5,6},{7,8,9}};
        int target = 4;
        if(ls(name1,target))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found");
        }
    }
    public static boolean ls(int[][] name1, int target)
    {
        for(int i=0;i<name1.length;i++)
        {
            for(int j=0;j<name1.length;j++)
            {
                if( name1[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
