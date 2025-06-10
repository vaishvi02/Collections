package src.main.com.StringAndArrays;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class findUniqueElements{

    public static boolean isUnique(String str){

        Set<String> hashSet = new HashSet<>();
        String[] strArr = str.split("");
        for(String s : strArr){
            if(!hashSet.contains(s))
                hashSet.add(s);
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        String str = "abBcd";
        System.out.println("isUnique :: "+isUnique(str));
    }
}