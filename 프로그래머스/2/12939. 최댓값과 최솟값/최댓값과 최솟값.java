import java.lang.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] sArr = s.split(" ");
        int max = Integer.parseInt(sArr[0]);
        int min = Integer.parseInt(sArr[0]);
        
        for(int i = 0; i<sArr.length; i++){
            max = Math.max(max, Integer.parseInt(sArr[i]));
            min = Math.min(min, Integer.parseInt(sArr[i]));
        }
        
        answer.append(String.valueOf(min))
            .append(" ").append(String.valueOf(max));
        
        return answer.toString();
    }
}