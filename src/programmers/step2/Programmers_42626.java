package programmers.step2;

import java.util.PriorityQueue;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 * 힙(Heap) > 더 맵게
 */
public class Programmers_42626 {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution(new int[]{1, 2}, 7);
        System.out.println(answer);
    }

    static int solution(int[] scoville, int k) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int n : scoville) {
            queue.add(n);
        }

        while (queue.size() >= 1) {
            int first = queue.poll();
            if (first >= k) {
                return answer;
            }else if(first < k && queue.size() == 0){
                return -1;
            }
            int second = queue.poll();
            int sum = first + (second * 2);
            answer++;
            queue.add(sum);
        }

        return answer;
    }
}
