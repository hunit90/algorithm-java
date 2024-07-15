package programmers.level0;

public class P120815 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n * 6; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P120815 solution = new P120815();
        solution.solution(6);
    }
}
