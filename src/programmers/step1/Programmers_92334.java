package programmers.step1;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/92334
// 2022 KAKO BLIND RECRUITEMENT > 신고 결과 받기
public class Programmers_92334 {

    public static void main(String[] args) {
        int[] answer = {};
        answer = solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo",
                        "muzi neo", "apeach muzi"}, 2);
//        answer = solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3);
        for(int i : answer){
            System.out.print(i + " ");
        }
    }

    static int[] solution(String[] idList, String[] report, int k){
        int[] answer = new int[idList.length];

        // 중복제거
       Set<String> reportSet = new HashSet<>();
        for(String s : report) {
            reportSet.add(s);
        }

        // 신고당한사람, 신고한 유저 리스트
        Map<String,List<String>> reportMap = new HashMap<>();
        for(String s : reportSet){
            String reporter = s.split(" ")[0];
            String reported = s.split(" ")[1];

            List<String> reporterList = reportMap.getOrDefault(reported, null);
            if (reporterList == null) {
                reporterList = new ArrayList<>();
            }
            reporterList.add(reporter);
            reportMap.put(reported, reporterList);
        }

        Map<String,Integer> reportCountMap = new HashMap<>();
        for(List<String> reportList : reportMap.values()){
            if(reportList.size() >= k){
                for(String reporter : reportList){
                    reportCountMap.put(reporter, reportCountMap.getOrDefault(reporter, 0) + 1);
                }
            }
        }

        for(int i = 0; i<idList.length; i++){
            answer[i] = reportCountMap.getOrDefault(idList[i],0);
        }

        return answer;
    }
}
