class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int length = p.length();
        
        Long number = Long.parseLong(p);
        
        for(int i = 0; i<=t.length()-length; i++){
            Long tNum = Long.parseLong(t.substring(i,i+length));
            if(tNum <= number){
                answer++;
            }
        }
        
        
        return answer;
    }
}