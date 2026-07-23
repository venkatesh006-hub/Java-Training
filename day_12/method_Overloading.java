package day_12.OOPS_Day1;
class E{
    int E(){
        return 1;
    }
    int E(int a,int b,int c){
        return a+b+c;
    }
    int E(int a,int b){
        return a+b;
    }
}

public class method_Overloading {
    public static void main(String[] args) {
        E obj = new E();
        int a=obj.E();
        System.out.println(a);
        int b = obj.E(4,3,5);
        System.out.println(b);
        int c = obj.E(3,4);
        System.out.println(c);
    }
}
