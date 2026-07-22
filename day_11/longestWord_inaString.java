package day_11;

import java.util.*;

public class longestWord_inaString {
    public static void main(String[] args) {
        String para = "Hello this is my JAVA world Where i do programming";
        String[] arr = para.split(" ");
        String max = arr[0];
        for(String ch:arr){
            if(ch.length()>max.length()){
                max=ch;
        }
        }
        System.out.println(max);
    }
}
