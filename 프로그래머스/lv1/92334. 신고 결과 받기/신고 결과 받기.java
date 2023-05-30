import java.util.*;

class Solution {
    public int[] solution(String[] idList, String[] report, int k) {
        int[] answer = new int[idList.length];

        Set<String> reportSet = new HashSet<>();
        Map<String, Integer> reportedMap = new HashMap<>();

        for(String reportList: report){
            reportSet.add(reportList);
        }

        Iterator<String> reportSetIterator = reportSet.iterator();
        while (reportSetIterator.hasNext()){
            String[] reportList = reportSetIterator.next().split(" ");
            reportedMap.put(reportList[1], reportedMap.getOrDefault(reportList[1], 0) + 1);
        }

        Iterator<String> reportSetIterator2 = reportSet.iterator();
        while (reportSetIterator2.hasNext()){
            String[] reportList = reportSetIterator2.next().split(" ");
            if(reportedMap.get(reportList[1]) >= k){
                for(int i = 0; i< idList.length; i++){
                    if(idList[i].equals(reportList[0])){
                        answer[i]++;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}