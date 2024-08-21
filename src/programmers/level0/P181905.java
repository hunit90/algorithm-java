package programmers.level0;

public class P181905 {
    public static void main(String[] args) {
        solution("Progra21Sremm3", 6, 12);
    }

    public static String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s, e+1);

        StringBuffer sb = new StringBuffer(answer);
        String reversedStr = sb.reverse().toString();

        my_string = my_string.replaceAll(answer, reversedStr);
        return my_string;
    }
}
