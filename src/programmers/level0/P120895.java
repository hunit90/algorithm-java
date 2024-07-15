package programmers.level0;

import java.util.Arrays;

public class P120895 {
    public String solution(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");
        String tmp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp;
        return String.join("", arr);
    }

    public static void main(String[] args) {
        P120895 p = new P120895();
        p.solution("hello", 1, 2);
    }
}
