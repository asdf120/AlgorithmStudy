import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            String spell = s.split("")[i];
            answer[i] = map.getOrDefault(spell, -1);
            if(answer[i] != -1){
                answer[i] = i - map.get(spell);
            }
            map.put(spell, i);
            
        }
        
        return answer;
    }
}