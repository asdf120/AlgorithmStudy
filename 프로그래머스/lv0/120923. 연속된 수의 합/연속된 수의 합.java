class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int centerNum = total / num;

        int startNum = centerNum - (num / 2);

         int sum = 0;
        while(true){
            for(int i = 0; i<answer.length; i++){
                sum += startNum +i;
                answer[i] = startNum+i;
            }
            if(sum == total){
                break;
            }
            startNum += 1;
            sum = 0;
            answer = new int[num];
        }

        return answer;
    }
}