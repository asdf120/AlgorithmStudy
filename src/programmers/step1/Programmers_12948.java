package programmers.step1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 * 연습문제 > 핸드폰 번호 가리기
 */
public class Programmers_12948 {
    public static void main(String[] args) {
        String answer = "";
        answer = solution("01033334444");
        answer = otherSolution("01033334444");
    }

    static String solution(String phone_number) {
        String answer = "";

        int length = phone_number.length() - 4;
        String firstNumnber = phone_number.substring(0, length);
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<=length; i++){
            sb.append("*");
        }
        answer = phone_number.replace(firstNumnber, sb.toString());

        return answer;
    }

    static String otherSolution(String phone_number){
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i<ch.length - 4; i++){
            ch[i] = '*';
        }

        return String.valueOf(ch);
    }
}
