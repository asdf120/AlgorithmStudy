import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        
        List<String> list = new ArrayList<>();
        for(char c : sb.toString().toCharArray()){
            list.add(String.valueOf(c));
        }
        Collections.sort(list, Collections.reverseOrder());
        sb.setLength(0);
        for(String s : list){
            sb.append(s);
        }
        
        return Long.parseLong(sb.toString());
    }
}