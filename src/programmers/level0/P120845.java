package programmers.level0;

public class P120845 {
    public int solution(int[] box, int n) {
        int answer, w, h, d = 0;

        w = box[0]/n;
        h = box[1]/n;
        d = box[2]/n;
        answer = w*h*d;
        return answer;
    }

    public static void main(String[] args) {
        P120845 t = new P120845();
        int[] box = {10,8,6};
        t.solution(box, 3);
    }
}
