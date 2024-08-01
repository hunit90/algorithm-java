package practice;

import java.util.Scanner;

/*
설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */
public class P0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        char[] x = s.toCharArray();
        int sf = 0;
        int sl = s.length() - 1;
        while (sf < sl) {
            if (!Character.isLetter(x[sf])) sf++;
            else if (!Character.isAlphabetic(x[sl])) sl--;
            else {
                char tmp = x[sf];
                x[sf] = x[sl];
                x[sl] = tmp;
                sf++;
                sl--;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            answer += x[i];
        }
        return answer;
    }
}
