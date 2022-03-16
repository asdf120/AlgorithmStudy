package programmers.step2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 * 스택/큐 > 기능개발
 */
public class Programmers_42586 {
    public static void main(String[] args) {
        int[] answer = {};
        answer = solution(new int[]{93,30,55}, new int[]{1,30,5});
//        answer = solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});

    }

    static int[] solution(int[] progresses, int[] speeds){
        int[] answer = {};

        Queue<Integer> completeQueue = new LinkedList<>();

        // 완료된 날짜를 넣어줌
        for(int i = 0; i<progresses.length; i++){
            int day = 0;
            while(progresses[i] < 100){
                progresses[i] += speeds[i];
                day++;
                if(progresses[i] >= 100){
                    completeQueue.add(day);
                }
            }
        }

        List<Integer> resultList = new ArrayList<>();

        // 완료 된 일들을 꺼내서 먼저꺼낸 일수보다 일수가 적으면  count를 더해줌 
        int firstProgress = completeQueue.poll();
        int count = 1;
        while(completeQueue.size() != 0){
            if(firstProgress >= completeQueue.peek()){
                completeQueue.poll();
                count++;
            }else{
                resultList.add(count);
                count = 1;
                firstProgress = completeQueue.poll();
            }
            if(completeQueue.size() == 0){
                resultList.add(count);
            }
        }

        answer = new int[resultList.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
