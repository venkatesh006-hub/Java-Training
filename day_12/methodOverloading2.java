package day_12.OOPS_Day1;

import java.util.Scanner;

class F {
    int a;
    int b;
    String c;
    String d;
    F(int a){
        this.a=a;
    }
    void display(int a)
    {
        System.out.println(a);
    }
    F()
    {

    }
    void display()
    {
        System.out.println("display");
    }
    F(int a , int b)
    {
        this.a=a;
        this.b=b;
    }
    void display(int a, int b)
    {
        System.out.println(a+" "+b);
    }
    F(int a, String c){
        this.a=a;
        this.c=c;
    }
    void display(int a, String c)
    {
        System.out.println(a+" "+c);
    }
    F(String c)
    {
        this.c=c;
    }
    void display(String c)
    {
        System.out.println(c);
    }
    F(String c, String d)
    {
        this.c=c;
        this.d=d;
    }
    void display (String c , String d)
    {
        System.out.println(c+" "+d);
    }
}
public class methodOverloading2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();
        String num2 = sc.nextLine();
        F obj = new F(num1,num2);
        obj.display(num1,num2);
    }
}