package programmers.step2;

import java.util.Stack;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 * 스택/큐 > 주식가격
 * TODO 다시 해보기
 */
public class Programmers_42584 {
    public static void main(String[] args) {
        otherSolution(new int[]{1,2,3,2,3});
    }

    static int[] solution(int[] prices){
        int[] answer = {};

        return answer;
    }

    static int[] otherSolution(int[] prices){
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< prices.length; i++){
            if(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        for(int i : answer){
            System.out.print(i + " ");
        }

        return answer;
    }
}
