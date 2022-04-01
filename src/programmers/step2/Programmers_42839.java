package programmers.step2;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42839
 * 완전탐색 > 소수찾기
 * 참고 : https://www.youtube.com/watch?v=pF368QqdQb4
 */
public class Programmers_42839 {
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) {
//        solution("17");
        int answer = solution("011");

        System.out.println(answer);
    }

    static int solution(String numbers){
        int answer = 0;
        boolean flag = true;
        // 모든 조합의 숫자를 만든다.
        recursive("", numbers);
        // 소수의 갯수를 만든다
        first: for(int num : set){
            flag = true;
            if (num == 0 || num == 1) {
                continue;
            }
            for(int i = 2; i<=Math.sqrt(num); i++){
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                answer++;
            }
        }

        // 소수의 갯수를 반환
        return answer;
    }

    /**
     * @param comb 지금까지 조합된 숫자
     * @param others 지금까지 조합되지 않은 숫자
     */
    static void recursive(String comb, String others){
        // 현재 조합을 set에 추가
        if(!comb.equals("")){
            set.add(Integer.valueOf(comb));
        }
        // 남은 숫자 중 한개를 더해서 새로운 조합을 만듦
        for(int i = 0; i<others.length(); i++){
            recursive(comb+others.charAt(i), others.substring(0,i)+others.substring(i+1));

        }
    }
}
