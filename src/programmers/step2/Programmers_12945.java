package programmers.step2;

import java.util.ArrayList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12945
 * 연습문제 > 피보나치 수
 */
public class Programmers_12945 {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution(54);
        System.out.println(answer);
    }
    static int solution(int n){

        return fibonacci(n) % 1234567;
    }

    static int fibonacci(int n){
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<2; i++){
            list.add(i);
        }
        for(int i = 2; i<=n; i++){
            int num = (list.get(i-2)%1234567) + (list.get(i-1)%1234567);
            list.add(num);
        }

        return list.get(list.size()-1);
    }

}
