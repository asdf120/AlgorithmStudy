import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();

        String[] todayArray = today.split("\\.");
        int todayDay = Integer.parseInt(todayArray[0]) * 12 * 28 + Integer.parseInt(todayArray[1]) * 28 + Integer.parseInt(todayArray[2]);

        for(int i = 0; i< privacies.length; i++){
            String[] privacyArray = privacies[i].split(" ");
            String signUpDate = privacyArray[0];
            String termType = privacyArray[1];

            String[] signUpDateArray = signUpDate.split("\\.");
            int signUpDateDay = Integer.parseInt(signUpDateArray[0]) * 12 * 28 + Integer.parseInt(signUpDateArray[1]) * 28 + Integer.parseInt(signUpDateArray[2]);

            for(String term : terms){
                String termName = term.split(" ")[0];
                int periodTime = Integer.parseInt(term.split(" ")[1]) * 28;

                if(termType.equals(termName)){
                    if(todayDay >= signUpDateDay + periodTime){
                        answerList.add(i+1);
                    }
                    break;
                }

            }
        }
        int[] answerArray = answerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();


        return answerArray;
    }
}