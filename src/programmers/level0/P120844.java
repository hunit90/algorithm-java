package programmers.level0;

public class P120844 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("right")) {
            for (int i = 0; i < answer.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
            answer[0] = numbers[numbers.length - 1];
        } else {
            for (int i = 0; i < answer.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[answer.length - 1] = numbers[0];
        }
        return answer;
    }

    public static void main(String[] args) {
        P120844 t = new P120844();
        int[] n = {1,2,3};
        t.solution(n, "right");
    }
}
