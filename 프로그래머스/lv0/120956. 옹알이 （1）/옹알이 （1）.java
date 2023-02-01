class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i< babbling.length; i++){
            String babb = babbling[i];
            for(int j = 0; j<words.length; j++){
                if(babb.startsWith(words[j])){
                    babb = babb.substring(words[j].length());
                    j = -1;
                }
                if(babb.isEmpty()){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}