package programmers.level0;

import java.util.*;

public class P181912 {
    public static void main(String[] args) {
        String[] intstrs = {"0123456789","9876543210","9999999999999"};
        solution(intstrs, 50000, 5, 5);
    }

    public static int[] solution(String[] intstrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();

        for (String str : intstrs) {
            int i = Integer.parseInt(str.substring(s, s + l));
            if (i > k) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
