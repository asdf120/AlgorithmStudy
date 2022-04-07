package programmers.step1;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42889
// 2019 KAKAO BLIND RECRUITEMENT > 실패율

public class Programmers_42889 {
    public static void main(String[] args) {
        int[] answer = {};
//        answer = solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        answer = solution(4, new int[]{4,4,4,4,4});
//        answer = otherSolution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});

        for (int num : answer) {
            System.out.print(num + " ");
        }
    }

    static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Double> failMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(i, new ArrayList<>());
            failMap.put(i, 0.0);
        }

        // 스테이지별 실패 카운트를 맵에 담음
        for (int stage : stages) {
            if (stage == N + 1) {
                continue;
            }
            List<Integer> list = map.get(stage);
            list.add(list.size() + 1);
        }
        
        // 스테이지별 남은 도전자 수
        int size = stages.length;
        
        // 단계별 실패율을 맵에 담음
        for (Integer stage : map.keySet()) {
            double failCount = map.get(stage).size();
            if (failCount == 0) {
                failMap.put(stage, 0.0);
                continue;
            }
            failMap.put(stage, failCount / size);
            size = size - (int) failCount;
        }

        // 실패율 리스트를 생성후 리스트에 실패율을 담은 후 내림차순
        List<Double> failList = new ArrayList<>();
        for (Double d : failMap.values()) {
            failList.add(d);
        }
        Collections.sort(failList, Collections.reverseOrder());

        // 단계별 실패율을 담은 맵의 값과 실패율 리스트를 비교하여 asnwer에 넣음
        for (int i = 0; i < failList.size(); i++) {
            int stage = 0;
            for (int n : failMap.keySet()) {
                if (failMap.get(n) == failList.get(i)) {
                    answer[i] = n;
                    stage = n;
                    break;
                }
            }
            failMap.remove(stage);
        }

        return answer;
    }

    static int[] solution2(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Double> failMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(i, 0);
            failMap.put(i, 0.0);
        }

        // 스테이지별 실패 카운트를 맵에 담음
        for (int stage : stages) {
            if (stage == N + 1) {
                continue;
            }
            int count = map.getOrDefault(stage, 0)+1;
            map.put(stage, count);
        }

        // 스테이지별 남은 도전자 수
        int size = stages.length;

        // 단계별 실패율을 맵에 담음
        for (Integer stage : map.keySet()) {
            double failCount = map.get(stage);
            if (failCount == 0) {
                failMap.put(stage, 0.0);
                continue;
            }
            failMap.put(stage, failCount / size);
            size = size - (int) failCount;
        }

        // 실패율 리스트를 생성후 리스트에 실패율을 담은 후 내림차순
        List<Double> failList = new ArrayList<>();
        for (Double d : failMap.values()) {
            failList.add(d);
        }
        Collections.sort(failList, Collections.reverseOrder());

        // 단계별 실패율을 담은 맵의 값과 실패율 리스트를 비교하여 asnwer에 넣음
        for (int i = 0; i < failList.size(); i++) {
            int stage = 0;
            for (int n : failMap.keySet()) {
                if (failMap.get(n) == failList.get(i)) {
                    answer[i] = n;
                    stage = n;
                    break;
                }
            }
            failMap.remove(stage);
        }

        return answer;
    }


    // https://sujin-k.tistory.com/61 참고
    static int[] otherSolution(int N, int[] stages) {
        int[] answer = new int[N];

        double[] stage = new double[N + 1];

        for (int i : stages) {
            if (i == N + 1) {
                continue;
            }
            stage[i]++;
        }

        // 실패율 리스트
        List<Double> failList = new ArrayList<>();

        // 스테이지 도달한 유저 수
        double num = stages.length;
        double temp = 0;

        for (int i = 1; i < stage.length; i++) {
            temp = stage[i];

            if (num == 0) {
                stage[i] = 0;
            } else {
                stage[i] = stage[i] / num;    // 실패 확률
                num = num - temp;
            }

            failList.add(stage[i]);
        }


        Collections.sort(failList, Collections.reverseOrder());

        for (int i = 0; i < failList.size(); i++) {
            for (int j = 1; j < stage.length; j++) {
                if (failList.get(i) == stage[j]) {
                    answer[i] = j;
                    stage[j] = -1;

                    break;
                }
            }
        }

        return answer;
    }
}
