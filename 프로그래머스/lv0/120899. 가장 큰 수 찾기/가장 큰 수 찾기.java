class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int temp = 0;
        for(int i = 0; i<array.length; i++){
            if(temp < array[i]){
                temp = array[i];
                answer[1] = i;
            }
        }
        answer[0] = temp;

        return answer;
    }
}