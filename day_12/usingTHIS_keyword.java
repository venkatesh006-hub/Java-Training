package day_12.OOPS_Day1;
class C{
    int id;
    String name;
    C(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }
}

public class usingTHIS_keyword {
    public static void main(String[] args) {
        C obj=new C(1,"M");
        obj.display();
    }
}
