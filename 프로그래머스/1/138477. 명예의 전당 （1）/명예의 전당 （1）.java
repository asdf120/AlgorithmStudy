import java.util.*;

class Solution {
    public int[] solution(int k, int[] scores) {
        int[] answer = new int[scores.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i = 0; i<scores.length; i++){
            queue.add(scores[i]);
            if(queue.size()>k){
                queue.poll();
            }
            answer[i] = queue.peek();
        }
        
        return answer;
    }
}