import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 0; i<moves.length; i++){
            int index = moves[i]-1;

for(int x = 0; x<board.length; x++){

                int doll = board[x][index];

                if(doll != 0){
                    if(stack.peek() == doll){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(board[x][index]);
                    }
                    board[x][index] = 0;
                    break;
                }

            }
        }

        return answer;
    }
}