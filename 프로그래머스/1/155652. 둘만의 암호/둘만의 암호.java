class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(String skipAlphabet : skip.split("")){
            if(alphabet.contains(skipAlphabet)){
                alphabet = alphabet.replace(skipAlphabet, "");
            }
        }
        
        int alphabetLength = alphabet.length();
        int sLength = s.length();
        String[] sArray = s.split("");
        
        for(int i = 0; i<sArray.length; i++){
            String sSpell = sArray[i];
            int sPellIndex = alphabet.indexOf(sSpell);
            if(sPellIndex+index > alphabetLength-1){
                int answerIndex = (index - (alphabetLength-1 - sPellIndex)-1) % alphabetLength;
                
                answer += alphabet.split("")[answerIndex];
                continue;
            }
            answer += alphabet.split("")[sPellIndex+index];
            
        }
        
        
        return answer;
    }
}