package main.java.GFG;

public class Sort012 {
    // to-do- reduce time complexity, 1 tst case remaining
    public void dutchNationalAlgo(int[] arr) {
        int beg = 0;
        int mid = 0;
        int end = arr.length - 1;
        int temp = 0;

        while (mid <= end) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[beg];
                    arr[beg] = arr[mid];
                    arr[mid] = temp;
                    beg++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;

                case 2: {
                    temp = arr[end];
                    arr[end] = arr[mid];
                    arr[mid] = temp;
                    end--;
                    break;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }

    public static void main(String[] args) {
        Sort012 obj = new Sort012();
        int[] arr = { 0, 1, 2, 0, 1, 2 };
        obj.dutchNationalAlgo(arr);
    }
}
