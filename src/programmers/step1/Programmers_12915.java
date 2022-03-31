package programmers.step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 * 연습문제 > 문자열 내 마음대로 정렬하기
 */
public class Programmers_12915 {
    public static void main(String[] args) {
//        solution(new String[]{"sun","bed","car"},1);
        solution(new String[]{"abce", "abcd", "cdx"},2);
    }

    static String[] solution(String[] strings, int n){
        String[] answer = new String[strings.length];
        String[] temp = new String[strings.length];

        for(int i = 0; i< strings.length; i++){
            temp[i] = strings[i];
            answer[i] = strings[i].substring(n, n+1) + temp[i];
        }

        Arrays.sort(answer);
        for(int i = 0; i< strings.length; i++){
            answer[i] = answer[i].substring(1);
            System.out.println(answer[i]);
        }

        return answer;
    }
}
