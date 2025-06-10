package main.java.StringsAndArrays;

import java.util.HashSet;
import java.util.Set;

public class findUniqueElements {

    public static boolean isUnique(String str) {

        Set<Character> hashSet = new HashSet<>();
        char[] strArr = str.toCharArray();
        for (char s : strArr) {
            if (!hashSet.contains(s))
                hashSet.add(s);
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abacd";
        System.out.println("isUnique :: " + isUnique(str));
    }
}