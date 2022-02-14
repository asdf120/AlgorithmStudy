package kakao;

// 2021 카카오 채용연계형 인턴십
// 숫자 문자열과 영단어
// https://programmers.co.kr/learn/courses/30/lessons/81301
// https://www.youtube.com/watch?v=B0pa3Cl2tMo&list=PL6YHvWRMtz7DhuPHdUZ0WLB5fNO729mbm&index=8 참고
public class NumberString {
    public static void main(String[] args) {

        System.out.println(solution("one4threetwo"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));
        System.out.println(solution("1zerotwozero3"));
    }

    static int solution(String s) {
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                stringBuilder.append(s.charAt(i++));
            } else {
                for (int j = 0; j < word.length; ++j) {
                    if (s.startsWith(word[j], i)) {
                        stringBuilder.append((char) ('0' + j));
                        i += word[j].length();
                        break;
                    }
                }
            }
        }
        int answer = Integer.parseInt(stringBuilder.toString());

        return answer;

    }
}
