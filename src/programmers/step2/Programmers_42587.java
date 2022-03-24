package programmers.step2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 * 스택/큐 > 프린터
 */
public class Programmers_42587 {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution(new int[]{2,1,3,2}, 2);
        System.out.println(answer);
    }

    static int solution(int[] priorities, int location){
        int answer = 0;

        Queue<Print> queue = new LinkedList<>();

        for(int i = 0; i<priorities.length; i++){
            queue.add(new Print(i, priorities[i]));
        }

        while(!queue.isEmpty()){
            Print print = queue.poll();

            boolean flag = false;
            for(Print p : queue){
                if(print.getPriority() < p.getPriority()){
                    flag = true;
                    break;
                }
            }
            if(flag){
                queue.add(print);
            }else{
                answer++;
                if(print.location == location){
                    break;
                }
            }


        }

        return answer;
    }

    static class Print {
        int location;
        int priority;

        public Print(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }

        public int getLocation() {
            return location;
        }

        public int getPriority() {
            return priority;
        }

        @Override
        public String toString() {
            return "Print{" +
                    "location=" + location +
                    ", priority=" + priority +
                    '}';
        }
    }
}
