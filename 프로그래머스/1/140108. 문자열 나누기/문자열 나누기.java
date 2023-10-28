class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sArr = s.split("");
        String x = sArr[0];
        int count = 1;
        
        for(int i = 1; i<sArr.length; i++){
            if(count == 0){
                x = sArr[i];
            }
            
            if(x.equals(sArr[i])){
                count++; 
            }else{
                count--;
            }
            
            if(count == 0){
                answer++;
            }
        }
        if(count != 0){
            answer++;
        }
        
        return answer;
    }
}