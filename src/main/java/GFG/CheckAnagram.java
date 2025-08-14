package main.java.GFG;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
                return false;

        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(int i=0; i< s1.length(); i++){
            if(map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            }
                else {
                map.put(s1.charAt(i), 1);
            }

            if(map2.containsKey(s2.charAt(i)))
                map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
            else
                map2.put(s2.charAt(i),1);
        }

        if(!map.equals(map2))
            return false;
        return true;
    }

    public static void main(String[] args){
        System.out.println("is anagram: "
                +isAnagram("geeks", "kseeg"));
    }
}
