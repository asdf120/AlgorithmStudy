class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] valueArray = String.valueOf(n).split("");
        for(String num : valueArray){
            answer += Integer.parseInt(num);
        }
        
        return answer;
    }
}