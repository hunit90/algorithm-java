package programmers.level0;

public class P181880 {
    public static void main(String[] args) {
        int[] num_list = {12,4,15,1,14};
        solution(num_list);
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            while(num_list[i] != 1) {
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                } else {
                    num_list[i] -= 1;
                    num_list[i] /= 2;
                }
                answer++;
            }
        }
        return answer;
    }
}
