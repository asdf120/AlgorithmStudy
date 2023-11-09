class Solution {
    public int[] solution(String s) {
        String number = s;
        int changeCount = 0;
        int zeroCount = 0;
        
        while(!number.equals("1")){
            for(char c :number.toCharArray()){
                if(c=='0'){
                    zeroCount++;
                }
            }
            number = Integer.toBinaryString(number.replace("0", "").length());
            
            changeCount++;
            
        }
        
        return new int[]{changeCount, zeroCount};
    }
}