import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            String spell = s.split("")[i];
            answer[i] = i-map.getOrDefault(spell, i+1);
            map.put(spell, i);
        }
        
        return answer;
    }
}