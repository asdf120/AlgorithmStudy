package programmers.step2;

import java.util.Stack;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12973
 * 2017 팁스타운 > 짝지어 제거하기
 */
public class Programmers_12973 {

    public static void main(String[] args) {
        int answer = 0;
        answer = solution("baabaa");
//        answer = solution("cdcd");
        System.out.println(answer);
    }

    static int solution(String s){
        int answer = 0;
        Stack<String> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(String.valueOf(s.charAt(i)));
            }else{
                String lastCh = stack.peek();
                if(lastCh.equals(String.valueOf(s.charAt(i)))){
                    stack.pop();
                }else{
                    stack.push(String.valueOf(s.charAt(i)));
                }
            }
        }

        if(stack.size() == 0){
            answer = 1;
        }

        return answer;
    }
}
