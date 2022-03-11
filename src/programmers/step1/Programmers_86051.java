package programmers.step1;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/86051
// 월간 코드 챌린지 시즌3 > 없는 숫자 더하기
public class Programmers_86051 {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution(new int[]{1,2,3,4,6,7,8,0});
        System.out.println(answer);
    }

    static int solution(int[] numbers){
        int answer = 0;

        int sum = 0;
        for(int i = 0; i<=9; i++){
            sum += i;
        }

        for(int num : numbers){
            answer += num;
        }

        answer = sum - answer;

        return answer;
    }
}
