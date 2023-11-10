import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        
        for(int i = cArr.length-1; i>=0; i--){
            answer.append(cArr[i]);
        }
        
        return answer.toString();
    }
}