package practice;

import java.util.Scanner;

public class P0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        String[] tmp = s.split(" ");
        int len = 0;

        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].length() > len) {
               len = tmp[i].length();
               answer = tmp[i];
            }
        }

        return answer;
    }
}
