class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i<quiz.length; i++){
            String[] quizArray = quiz[i].split(" ");
            if(quizArray[1].equals("-")){
                int answerNum = Integer.parseInt(quizArray[0]) - Integer.parseInt(quizArray[2]);
                if(answerNum == Integer.parseInt(quizArray[quizArray.length-1])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
                continue;
            }
            if(quizArray[1].equals("+")){
                int answerNum = Integer.parseInt(quizArray[0]) + Integer.parseInt(quizArray[2]);
                if(answerNum == Integer.parseInt(quizArray[quizArray.length-1])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }

        }
        return answer;
    }
}