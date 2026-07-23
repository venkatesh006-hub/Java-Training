package day_12.OOPS_Day1;
class D{
    int a;
    int b;
    String c;
    String d;
    D(int a){
        this.a=a;
    }
    D(int a,int b){
        this.a=a;
        this.b=b;
    }
    D(int a,String c){
        this.a=a;
        this.c=c;
    }
    D(String d, int b){
        this.d=d;
        this.b=b;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class constructor_Overloading {
    public static void main(String[] args) {
        D obj=new D("Man", 2);
        D obj1=new D(1,2);
        D obj2=new D(23,"Jenin");
        D obj3=new D(3);
        obj.display();
        obj1.display();
        obj2.display();
        obj3.display();

    }
}
