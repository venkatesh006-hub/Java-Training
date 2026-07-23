package day_12.OOPS_Day1;

class AB{                            //class
    int age;                        //fields
    String name;                    //fields
    void display(){                 //methods
        System.out.println("Display");
    }
}

public class Oops {
    public static void main(String[] args) {
        AB obj=new AB();
        obj.display();              //object
    }
}
