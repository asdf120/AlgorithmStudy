class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] numArray = String.valueOf(num).split("");
        for(int i = 1; i<=numArray.length; i++){
            if(Integer.parseInt(numArray[i-1]) == k){
                answer = i;
                break;
            }
        }

        return answer;
    }
}