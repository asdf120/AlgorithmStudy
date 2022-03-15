package programmers.step1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 * 연습문제 > 이상한 문자 만들기
 */
public class Programmers_12930 {
    public static void main(String[] args) {
        String answer = "";
        answer = solution("try hello world");
//        answer = solution("try hello world ");
        System.out.println(answer);
    }

    static String solution(String s){

        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        int i = 0;
        for(char c : ch){
            String str = "";
            if(c == ' '){
                sb.append(c);
                i = 0;
                continue;
            }
            if(i % 2 == 0){
                str = String.valueOf(c).toUpperCase();
            }else if(i % 2 == 1){
                str = String.valueOf(c).toLowerCase();
            }
            sb.append(str);
            i++;
        }
        return sb.toString();
    }
}
