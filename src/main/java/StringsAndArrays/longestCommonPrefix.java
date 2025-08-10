package main.java.StringsAndArrays;

public class longestCommonPrefix {
    public static String findLongestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0)
                    return "";
            }
        }

        return prefix;
    }

    public static String findLongestCommonPrefix(String s) {



        return "";
    }



    public static void main(String[] args) {
        String[] strs = { "dog", "dracecar", "docar" };
        System.out.println(findLongestCommonPrefix(strs));
    }
}