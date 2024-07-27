package practice;

import java.util.Scanner;

public class P01 {
    public static int solution(String a, char b) {
        int answer = 0;
        b = Character.toLowerCase(b);
        for (int i = 0; i < a.length(); i++) {
            if (a.toLowerCase().charAt(i) == b) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b = sc.nextLine().charAt(0);

        System.out.println(solution(a, b));
    }
}
