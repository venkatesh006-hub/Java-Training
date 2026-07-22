package day_10;

public class stringcreation {
    public static void main(String[]args){
        String name1="hello";
        String name2="hello";
        System.out.println(name1==name2);
        String name3=new String("Hello");
        String name4=new String("Hello");
        System.out.println(name3.equals(name4));
        char[]chars={'h','e','l','l','o'};
        String str1=new String(chars);
        System.out.println(str1);


        StringBuilder name5=new StringBuilder("hello");
        StringBuilder name6=new StringBuilder("hello");
        String str2=name5.toString();
        String str3=name6.toString();
        System.out.println(name5==name6);

    }
}
