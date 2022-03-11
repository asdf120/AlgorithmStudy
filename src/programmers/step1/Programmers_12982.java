package programmers.step1;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12982
// Summer/Winter Coding(~2018) > 예산
public class Programmers_12982 {

    public static void main(String[] args) {
        int answer = 0;
        answer = solution(new int[]{1,3,2,5,4}, 9);
        answer = solution(new int[]{2,2,3,3}, 10);
        System.out.println(answer);
    }

    static int solution(int[] d, int budget){
        int answer = 0;

        Arrays.sort(d);

        int sum = 0;
        for(int i = 0; i<d.length; i++){
            sum += d[i];
            if(sum > budget){
                break;
            }
            answer++;
        }

        return answer;
    }
}
