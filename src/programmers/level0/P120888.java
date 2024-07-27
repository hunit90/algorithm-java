package programmers.level0;

public class P120888 {
    public static String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.indexOf(my_string.charAt(i)) == i) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution("people");
    }
}
