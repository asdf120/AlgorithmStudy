package programmers.step1;

import java.util.HashSet;
import java.util.Set;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/1845
 * 찾아라 프로그래밍 마에스터 > 폰켓몬
 */
public class Programmers_1845 {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution(new int[]{3,1,2,3});
        System.out.println(answer);
    }

    static int solution(int[] nums){
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int choiceCount = nums.length / 2 ;
        if(choiceCount < set.size()){
            answer = choiceCount;
        }else if(choiceCount >= set.size()){
            answer = set.size();
        }

        return answer;
    }
}
