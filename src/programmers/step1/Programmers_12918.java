package programmers.step1;

// https://programmers.co.kr/learn/courses/30/lessons/12918
// 연습문제 > 문자열 다루기 기본
public class Programmers_12918 {
    public static void main(String[] args) {
        boolean answer = true;
        answer = solution("a234");
        answer = solution("1234");
    }

    static boolean solution(String s){
        if(s.length() != 4 && s.length() != 6){
            return false;
        }

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }

        return true;
    }
}
