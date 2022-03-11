package programmers.step1;

// https://programmers.co.kr/learn/courses/30/lessons/70128
// 월간 코드 챌린지 시즌1 > 내적
public class Programmers_70128 {

    public static void main(String[] args) {
        int answer = 0;
        answer = solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});
        System.out.println(answer);
    }

    static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}
