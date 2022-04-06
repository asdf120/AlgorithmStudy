package programmers.step1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/81301
 * 2021 카카오 채용연계형 인턴십 > 숫자 문자열과 영단어
 */
public class Programmers_81301 {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }

    static int solution(String s) {
        int answer = 0;
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i<numbers.length; i++){
            if(s.contains(numbers[i])){
                s= s.replace(numbers[i], String.valueOf(i));
            }
        }
        answer = Integer.parseInt(s);

        return answer;
    }
}
