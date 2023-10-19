class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for(char spell: s.toCharArray()){
            char temp = spell;
            int idx = 0;

            while(idx < index){
                if(temp == 'z'){
                    temp = 'a';
                }else{
                    temp = (char) (temp+1);
                }
                if(!skip.contains(String.valueOf(temp))){
                    idx++;
                }
            }
            answer.append(temp);

        }

        return answer.toString();
    }
}