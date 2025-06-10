import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class checkPermutation{

    public static boolean isPermutation(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        List<String> arrList = Arrays.asList(str1.split(""));
        List<String> arrList2 = Arrays.asList(str2.split(""));
        Collections.sort(arrList);
        Collections.sort(arrList2);

        if(!arrList.equals(arrList2))
            return false;

        return true;
    }

    public static void main(String[] args) {
        String str1 = "abacacae";
        String str2 = "bcaaacea";
        System.out.println("palindrome: "+isPermutation(str1,str2));
    }
}