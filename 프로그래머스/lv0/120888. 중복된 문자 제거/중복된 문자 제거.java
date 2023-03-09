class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] answerList = my_string.split("");

        for(String s : answerList){
            if(answer.toString().contains(s)){
                continue;
            }
            answer.append(s);
        }

        return answer.toString();
    }
}