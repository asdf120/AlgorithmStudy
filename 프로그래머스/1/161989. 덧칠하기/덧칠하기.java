class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        if(m == 1){
            return section.length;
        }
        
        int max = 0;
        for(int wall: section){
            if(wall <= max){
                continue;
            }
            answer++;
            max = wall+m-1;
        }
        
        return answer;
    }
}