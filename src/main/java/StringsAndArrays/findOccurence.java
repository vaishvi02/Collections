package main.java.StringsAndArrays;

import java.util.HashMap;
import java.util.Map;

public class findOccurence {
    public static int strStr(String haystack, String needle) {
        int d = needle.length();
        if (haystack.equals(needle))
            return 0;
        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < haystack.length();i++) {
            if (d + i > haystack.length()) {
                break;
            }
            if (!hm.containsKey(haystack.substring(i, d + i))) {
                hm.put(haystack.substring(i, d + i), i);
            }
        }
        for (String s : hm.keySet()) {
            if (s.equals(needle))
                return hm.get(s);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("index= " + strStr("abc", "c"));
    }
}
