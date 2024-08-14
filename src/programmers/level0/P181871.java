package programmers.level0;

/*
문자열 myString과 pat이 주어집니다.
myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ myString ≤ 1000
1 ≤ pat ≤ 10
입출력 예
myString	pat	result
"banana"	"ana"	2
"aaaa"	"aa"	3
입출력 예 설명
입출력 예 #1

"banana"에서 1 ~ 3번 인덱스에서 한 번,
3 ~ 5번 인덱스에서 또 한 번 "ana"가 등장해서 총 두 번 등장합니다. 따라서 2를 return 합니다.
입출력 예 #2

"aaaa"에서 0 ~ 2번 인덱스에서 한 번,
 1 ~ 3번 인덱스에서 한 번, 2 ~ 4번 인덱스에서 한 번 "aa"가 등장해서 총 세 번 등장합니다.
  따라서 3을 return 합니다.
 */

public class P181871 {
    public static void main(String[] args) {
        solution("banana", "ana");
    }

    public static int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length(); i++) {
            String subStr = myString.substring(0, i+1);
            if(subStr.endsWith(pat)) {
                answer++;
            }
        }
        return answer;
    }
}
