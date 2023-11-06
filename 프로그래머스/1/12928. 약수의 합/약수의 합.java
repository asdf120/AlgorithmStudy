import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        double sqrt = Math.sqrt(n);
        for(int i = 1; i<=sqrt; i++){
            if(n % i == 0){
                if(i*i == n){
                    answer+= i;
                    continue;
                } 
                answer += i;
                answer += n/i;
            }
        }
        
        return answer;
    }
}