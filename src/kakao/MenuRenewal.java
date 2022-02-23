package kakao;

import java.util.*;

/**
 * 2021 카카오 Blind Recruitment
 * 메뉴 리뉴얼
 * https://programmers.co.kr/learn/courses/30/lessons/72411
 * https://www.youtube.com/watch?v=22tBC3YXVPA&list=PL6YHvWRMtz7DhuPHdUZ0WLB5fNO729mbm&index=2&t=71s 참고
 */
public class MenuRenewal {

    public static void main(String[] args) {
        String[] answer = solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2,3,4});
        for(String a : answer){
            System.out.println(a);
        }
    }

    static List<Map<String, Integer>> foodMaps = new ArrayList<>();
    static int[] maxCount = new int[11];   // 메뉴갯수별 최대 주문 횟수

    static String[] solution(String[] orders, int[] course) {

        for (int i = 0; i <= 10; i++) {  // 주문이 10이하이기때문에 <=10 설정
            foodMaps.add(new HashMap<String, Integer>());
        }

        for (String str : orders) {
            // 조합은 순서가 중요하지 않기때문에 정렬을 먼저해줌
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            combination(arr, 0, new StringBuilder());
        }

        List<String> answerList = new ArrayList<>();

        for (int length : course) {
            for (Map.Entry<String, Integer> entry : foodMaps.get(length).entrySet()) {
                if(entry.getValue() >= 2 && entry.getValue() == maxCount[length]){
                    answerList.add(entry.getKey());
                }
            }
        }
        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        for(int i = 0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    static void combination(char[] str, int position, StringBuilder candidate) {
        if (position >= str.length) {
            int length = candidate.length();
            if (length >= 2) {
                int count = foodMaps.get(length).getOrDefault(candidate.toString(), 0) + 1;
                foodMaps.get(length).put(candidate.toString(), count);
                maxCount[length] = Math.max(maxCount[length], count);
            }
            return;
        }

        combination(str, position + 1, candidate.append(str[position]));
        candidate.setLength(candidate.length() - 1);
        combination(str, position + 1, candidate);
    }

}
