package programmers.level0;

public class P181930 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && a != c && b != c) {
            answer = a + b + c;
        } else if (a == b && a == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        return answer;
    }

    public static void main(String[] args) {
        P181930 p = new P181930();
        p.solution(2,6, 1);
    }
}
