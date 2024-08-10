package programmers.level0;

public class P181900 {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        solution(my_string, indices);
    }

    public static String solution(String my_string, int[] indices) {
        String answer = "";

        String[] tmp = my_string.split("");

        for (int i = 0 ; i < indices.length ; i++) {
            tmp[indices[i]] = "";
        }

        for (String s : tmp) {
            answer += s;
        }
        return answer;
    }
}
