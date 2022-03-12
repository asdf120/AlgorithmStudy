package programmers.step1;

import java.util.Arrays;
import java.util.HashMap;

// https://programmers.co.kr/learn/courses/30/lessons/42576
// 해시 > 완주하지 못한 선수

public class Programmers_42576 {
    public static void main(String[] args) {
        String answer = "";
//        answer = solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        answer = solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        answer = otherSolution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println(answer);
    }

    static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
            if(i == completion.length-1){
                return participant[completion.length];
            }
        }

        return answer;
    }

    static String otherSolution(String[] participant, String[] completion){
        String answer = "";

        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }

        return answer;
    }
}
