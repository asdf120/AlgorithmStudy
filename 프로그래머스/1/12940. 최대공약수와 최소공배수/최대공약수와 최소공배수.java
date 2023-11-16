import java.lang.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
    
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int num = 1;
    
        while(num != 0){
            answer[0] = min;
            num = max % min;
            max = min;
            min = num;
        }
        answer[1] = n*m/answer[0];
        
        
        return answer;
    }
}