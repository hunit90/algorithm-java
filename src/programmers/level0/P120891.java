package programmers.level0;

public class P120891 {
    public int solution(int order) {
        int answer = 0;
        String s = Integer.toString(order);
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P120891 p = new P120891();
        p.solution(29423);
    }
}
