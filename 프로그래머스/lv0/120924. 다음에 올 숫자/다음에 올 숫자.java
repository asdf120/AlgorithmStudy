class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int differenceValue1 = common[1] - common[0];
        int differenceValue2 =  common[2] - common[1];
        
        if(differenceValue2 == differenceValue1){
            answer = common[common.length-1] + differenceValue1;
        }else{
            int value = common[1] / common[0];
            answer = common[common.length-1] * value;
        }
        
        
        return answer;
    }
}