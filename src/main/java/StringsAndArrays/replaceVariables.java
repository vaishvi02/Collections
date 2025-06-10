package main.java.StringsAndArrays;

public class replaceVariables {

    public static String urlify(String url) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = url.trim().split(" ");
        for (String s : strArr) {
            stringBuffer.append(s).append("%20");
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String s = "Hello John     ";
        System.out.println("Replaced: " + urlify(s));
    }
}