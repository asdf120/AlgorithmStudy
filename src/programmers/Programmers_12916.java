package programmers;

import java.util.Locale;

// https://programmers.co.kr/learn/courses/30/lessons/12916
// 연습문제 > 문자열 내 p와 y의 개수
public class Programmers_12916 {
    public static void main(String[] args) {
        boolean answer = true;
        answer = solution("pPoooyY");
        System.out.println(answer);
    }
    static boolean solution(String s){
        boolean answer = true;
        s = s.toUpperCase();
        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'P'){
                pCount++;
            }else if(c =='Y'){
                yCount++;
            }
        }
        if(pCount != yCount){
            return false;
        }

        return answer;
    }
}
