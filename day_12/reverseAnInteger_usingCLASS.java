package day_12.OOPS_Day1;
class reverse_A_Integer{
    int num;
    int reverse_A_Integer(int num){
        this.num=num;
        int reverse=0;
        while(num!=0){
            int pop=num%10;
            reverse=reverse*10+pop;
            num/=10;
        }
        return reverse;
    }
}

public class reverseAnInteger_usingCLASS {
    public static void main(String[] args) {
        reverse_A_Integer obj = new reverse_A_Integer();
        int rev = obj.reverse_A_Integer(123);
        System.out.println(rev);


    }
}
