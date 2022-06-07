package programmers.step1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 * 연습문제 > 자릿수 더하기
 */
public class Programmers_12931 {
    public static void main(String[] args) {
        int answer = solution(123);
        System.out.println(answer);
    }

    static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n%10;
            n = n / 10;
        }

        return answer;
    }

}
