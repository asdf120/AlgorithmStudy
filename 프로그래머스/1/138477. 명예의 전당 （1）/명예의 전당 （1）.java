import java.util.*;

class Solution {
    public int[] solution(int k, int[] scores) {
        int[] answer = new int[scores.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<scores.length; i++){
            if(i < k){
                list.add(scores[i]);
                Collections.sort(list, Collections.reverseOrder());
                answer[i] = list.get(list.size()-1);
            }else{
                list.add(scores[i]);
                Collections.sort(list, Collections.reverseOrder());
                answer[i] = list.get(k-1);
            }
        }
        
        return answer;
    }
}