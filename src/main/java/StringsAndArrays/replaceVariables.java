package main.java.StringsAndArrays;

public class replaceVariables {

    public static String urlify(String url) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = url.trim().split(" ");
        for (int i=0; i<strArr.length; i++) {
            if(i != strArr.length-1)
                stringBuffer.append(strArr[i]).append("%20");
            else
                stringBuffer.append(strArr[i]);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String s = "Hello John    Welcome ";
        System.out.println("Replaced: " + urlify(s));
    }
}