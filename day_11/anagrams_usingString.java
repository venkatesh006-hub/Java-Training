package day_11;

import java.util.*;

public class anagrams_usingString {
    public static void main(String[] args) {
        String name1 ="listen";
        String name2="silent";
        if(name1.length()!=name2.length()){
            System.out.println("Not an anagram");
        }
        char arr1[]=name1.toCharArray();
        char arr2[]=name2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an anagram");
        }
    }
}
