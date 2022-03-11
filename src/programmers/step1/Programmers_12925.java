package programmers.step1;

// https://programmers.co.kr/learn/courses/30/lessons/12925
// 연습문제 > 문자열을 정수로 바꾸기

public class Programmers_12925 {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution("1234");
        answer = getStrToInt("-1234");
        System.out.println(answer);
    }

    static int solution(String s){
        int answer = 0;

        char first = s.charAt(0);
        if(first >= '0' || first <= '9'){
            answer = Integer.parseInt(s);
        }

        return answer;
    }

    // 다른 사람 정답
    static int getStrToInt(String str) {
        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                Sign = false;
            else if(ch !='+')
                result = result * 10 + (ch - '0');
        }
        return Sign?1:-1 * result;
    }
}
