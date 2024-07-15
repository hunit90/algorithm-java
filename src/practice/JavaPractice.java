package practice;

import java.util.Arrays;
import java.util.Collections;

public class JavaPractice {
    public static void main(String[] args) {
        String[] arr1 = new String[5];
        int[] arr2 = {1,2,3,4,5};
        int N = 3;

        int arr[] = {10, 8,  11, 2, 3, 0};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
    }
}
