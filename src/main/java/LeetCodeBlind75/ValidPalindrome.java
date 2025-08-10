package main.java.LeetCodeBlind75;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    public static void main(String[] args){
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println("is palindrome: "+vp.isPalindrome("A man, a plan, a canal:::: Panama"));
    }

}
