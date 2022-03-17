package programmers.step1;

import java.util.Stack;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 * 2019 카카오 개발자 겨울 인턴십 > 크레인 인형뽑기 게임
 */
public class Programmers_64061 {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4});
//        answer = solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1,4,5,3,5});
//        answer = solution(new int[][]{{0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}}, new int[]{1, 2, 3, 3, 2, 3, 1});
//        answer = solution(new int[][]{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 3, 0}, {0, 1, 5, 0, 3, 1}, {2, 2, 5, 0, 1, 2}, {4, 2, 4, 4, 2, 3}, {3, 5, 1, 3, 1, 4}}, new int[]{1, 5, 3, 5, 1, 5, 3, 4, 2, 2, 4});
        System.out.println(answer);
    }

    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);


        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int move = moves[i] - 1;
                if (board[j][move] != 0) {
                    if (stack.peek() == board[j][move]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move]);
                    }
                    board[j][move] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
