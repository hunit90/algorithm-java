package programmers.level0;

import java.util.Arrays;

public class P181857 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        solution(arr);
    }

    public static int[] solution(int[] arr) {
        int n = arr.length;
        int targetLength = 1;

        while(targetLength < n) {
            targetLength *= 2;
        }

        int[] answer = new int[targetLength];
        Arrays.fill(answer, 0);

        System.arraycopy(arr, 0, answer, 0, n);

       return answer;
    }
}
