import java.lang.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int number = n;
        
        int aNumber = a;
        int bNumber = b;
        
        if(Math.abs(aNumber - bNumber) == 1 && aNumber/2 != bNumber/2){
            return answer;
        }
        
        while(number != 2){
            number /= 2;
            answer += 1;
            
            if(aNumber % 2 == 0){
                aNumber /= 2;
            }else{
                aNumber = (aNumber/2) + 1;
            }
            
            if(bNumber % 2 == 0){
                bNumber /= 2;
            }else{
                bNumber = (bNumber/2) + 1;
            }
            
            if(Math.abs(aNumber - bNumber) == 1 && aNumber/2 != bNumber/2) break;
        }
        
        return answer; 
    }
} 