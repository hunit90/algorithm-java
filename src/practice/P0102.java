package practice;

import java.util.Scanner;

public class P0102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                answer.append(Character.toLowerCase(s.charAt(i)));
            } else {
                answer.append(Character.toUpperCase(s.charAt(i)));
            }
        }

        return answer.toString();
    }
}
