package day_12.OOPS_Day1;
class A {
    int id;
    String name;
    int age;

    A() {
        System.out.println("A");
    }

    A(int n) {
        System.out.println(n + n);
    }

    A(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }
}

public class constructors {
    public static void main(String[] args) {
        A obj=new A();
        A number=new A(5);
        A person1=new A(21,"kishore",35);
        A person2=new A(22, "Jenin", 34);
        person1.display();
        person2.display();
    }
}
