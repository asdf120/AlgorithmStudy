import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();

        String[] personalityTypeArray = new String[]{"RT", "CF", "JM", "AN"};
        Map<String, Integer> scoreMap = new HashMap<>();

        for(int i = 0; i< survey.length; i++){
            String[] type = survey[i].split("");
            int score = 0;
            int choice = choices[i];

            if(choice < 4){
                if(choice == 1) score = 3;
                if(choice == 2) score = 2;
                if(choice == 3) score = 1;
                scoreMap.put(type[0], scoreMap.getOrDefault(type[0], 0) + score);
            }else if(choice > 4){
                if(choice == 5) score = 1;
                if(choice == 6) score = 2;
                if(choice == 7) score = 3;
                scoreMap.put(type[1], scoreMap.getOrDefault(type[1], 0) + score);
            }
        }

        for(String personalityType : personalityTypeArray){
            String[] type = personalityType.split("");
            String first = type[0];
            String second = type[1];

            if(scoreMap.getOrDefault(first,0) >= scoreMap.getOrDefault(second, 0)){
                sb.append(first);
            }else if(scoreMap.getOrDefault(first,0) < scoreMap.getOrDefault(second, 0)){
                sb.append(second);
            }
        }

        return sb.toString();
    }
}