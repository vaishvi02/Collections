package main.java.StringsAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindMissingFromRange {

    public static void main(String[] args){
        FindMissingFromRange obj = new FindMissingFromRange();
        int[] arr = {0, 1, 3, -3, 4, -2};
        obj.findMissingInRange(arr);
    }

    public void findMissingInRange(int[] arr){
        /*
        Input :  0, 1, 3, -3, 4, -2
        Output: -1, 2

        */
        List<Integer> intlist = new ArrayList<>();
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        List<Integer> missingElements = IntStream.range(min,max).
                filter(x -> (Arrays.stream(arr).noneMatch( y -> y == x))).boxed()
                .toList();

        System.out.println("missing members = "+missingElements);
    }
}
