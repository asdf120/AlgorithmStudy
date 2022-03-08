package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12934
// 연습문제 > 정수 제곱근 판별
public class Programmers_12934 {
    public static void main(String[] args) {
        long answer = 0;
        answer = solution(121);
        answer = solution(1000000);
        System.out.println(answer);
    }

    static long solution(long n) {
        long answer = -1;

        double num = Math.sqrt(n);

        if((int)Math.sqrt(n) == num){
            answer = ((long)num+1) * ((long)num+1);
        }

        return answer;
    }
}
