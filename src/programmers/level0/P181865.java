package programmers.level0;

public class P181865 {
    public int solution(String binomial) {
        int answer = 0;
        String[] tmp = binomial.split(" ");

        if (tmp[1].equals("+")) answer = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]);
        if (tmp[1].equals("-")) answer = Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);
        if (tmp[1].equals("*")) answer = Integer.parseInt(tmp[0]) * Integer.parseInt(tmp[2]);

        return answer;
    }

    public static void main(String[] args) {
        P181865 p = new P181865();
        p.solution("43 + 12");
    }
}
