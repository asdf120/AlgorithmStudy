package programmers.step1;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42889
// 2019 KAKAO BLIND RECRUITEMENT > 실패율

public class Programmers_42889 {
    public static void main(String[] args) {
        int[] answer = {};
        answer = otherSolution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});

        for(int num : answer){
            System.out.print(num + " ");
        }
    }

    static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, List<Integer>> failStageMap = new HashMap<>();

        // 실패 스테이지 별로 담음
        for (int i = 0; i < stages.length; i++) {
            List<Integer> failList = failStageMap.getOrDefault(stages[i], null);
            if (failList == null) {
                failList = new ArrayList<>();
            }
            failList.add(stages[i]);
            failStageMap.put(stages[i], failList);
        }
        System.out.println("26line");
        System.out.println(((double) 1 / 8));


        for (List<Integer> stage : failStageMap.values()) {
            for(int i = 0; i<stage.size(); i++){
                System.out.print(stage.get(i) + " ");
            }
            System.out.println();
        }

        return answer;
    }

    
    // https://sujin-k.tistory.com/61 참고
    static int[] otherSolution(int N, int[] stages){
        int[] answer = new int[N];

        double[] stage = new double[N+1];

        for(int i : stages){
            if(i == N+1){
                continue;
            }
            stage[i]++;
        }

        // 실패율 리스트
        List<Double> failList = new ArrayList<>();

        // 스테이지 도달한 유저 수
        double num = stages.length;
        double temp = 0;

        for(int i = 1; i<stage.length; i++){
            temp = stage[i];

            if (num == 0) {
                stage[i] = 0;
            }else{
                stage[i] = stage[i]/num;    // 실패 확률
                num = num - temp;
            }

            failList.add(stage[i]);
        }


        Collections.sort(failList, Collections.reverseOrder());

        for(int i = 0; i< failList.size(); i++){
            for(int j = 1; j<stage.length; j++){
                if(failList.get(i) == stage[j]){
                    answer[i] = j;
                    stage[j] = -1;

                    break;
                }
            }
        }

        return answer;
    }
}
