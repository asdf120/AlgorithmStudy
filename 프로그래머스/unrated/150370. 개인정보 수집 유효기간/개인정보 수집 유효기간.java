import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();

        String[] todayArray = today.split("\\.");

        for(int i = 0; i< privacies.length; i++){
            String signUpDate = privacies[i].split(" ")[0];
            String termType = privacies[i].split(" ")[1];

            String[] signUpDateArray = signUpDate.split("\\.");

            if(!checkValidation(terms, todayArray, signUpDateArray, termType)){
                answerList.add(i+1);
            }
        }

        int[] answerArray = answerList.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        return answerArray;
    }
    
    boolean checkValidation(String[] terms, String[] todayArray, String[] signUpDateArray, String termType){
        for(String term: terms){
            String termName = term.split(" ")[0];
            int termPeriod = Integer.parseInt(term.split(" ")[1]);

            if(termType.equals(termName)){
                int todayYear = Integer.parseInt(todayArray[0]);
                int todayMonth = Integer.parseInt(todayArray[1]);
                int todayDay = Integer.parseInt(todayArray[2]);

                int signUpYear = Integer.parseInt(signUpDateArray[0]);
                int signUpMonth = Integer.parseInt(signUpDateArray[1]);
                int signUpDay = Integer.parseInt(signUpDateArray[2]);

                int year = termPeriod / 12;
                int month = termPeriod % 12;
                signUpYear += year;
                signUpMonth += month;
                
                if(signUpMonth > 12){
                    signUpMonth %= 12;
                    signUpYear += 1;
                }

                if(signUpDay == 1){
                    signUpDay = 28;
                    signUpMonth -= 1;
                    if(signUpMonth == 0){
                        signUpYear -= 1;
                        signUpMonth = 12;
                    }
                }else{
                    signUpDay -= 1;
                }

                if(signUpYear < todayYear){
                    return false;
                }else if(signUpYear > todayYear){
                    return true;
                }

                if(signUpMonth < todayMonth){
                    return false;
                }else if(signUpMonth > todayMonth){
                    return true;
                }

                if(signUpDay < todayDay){
                    return false;
                }
            }
        }
        return true;
    }
}