package programmers.step2;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12899
 * 연습문제 > 124 나라의 숫자
 */
public class Programmers_12899 {
    public static void main(String[] args) {
        String answer = "";
        answer = solution(1);
        answer = solution(2);
        answer = solution(3);
        answer = solution(4);
        answer = solution(5);
        answer = solution(6);
        answer = solution(7);
        answer = solution(8);
//        System.out.println(answer);

    }

    static String solution(int num) {
        StringBuilder sb = new StringBuilder();

        int div;
        while (num > 0) {
            div = num % 3;
            if (div == 0) {
                num--;
                div = 4;
            }
            sb.append(div);
            num = num / 3;
        }

        return sb.reverse().toString();
    }
}
