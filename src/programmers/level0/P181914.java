package programmers.level0;

public class P181914 {
    public int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            answer += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return answer % 9;
    }

    public static void main(String[] args) {
        P181914 p = new P181914();
        p.solution("78720646226947352489");
    }
}
