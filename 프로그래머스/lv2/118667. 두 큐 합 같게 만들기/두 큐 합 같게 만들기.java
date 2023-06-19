import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long firstQueueSum = 0;
        long secondQueueSum = 0;

        Queue<Integer> firstQueue = new ArrayDeque();
        Queue<Integer> secondQueue = new ArrayDeque();

        for(int i = 0; i<queue1.length; i++){
            firstQueueSum += queue1[i];
            secondQueueSum += queue2[i];

            firstQueue.add(queue1[i]);
            secondQueue.add(queue2[i]);
        }
        if(firstQueueSum == secondQueueSum){
            return 0;
        }else if((firstQueueSum+secondQueueSum) % 2 == 1){
            return -1;
        }

        int count =0;
        while(true){
            if(firstQueue.size() == 0 || secondQueue.size() == 0 || count > (queue1.length*4) ){
                return -1;
            }

            if(firstQueueSum > secondQueueSum){
                int number = firstQueue.poll();
                secondQueue.add(number);
                firstQueueSum -= number;
                secondQueueSum += number;
                count++;
            }
            if(firstQueueSum < secondQueueSum){
                int number = secondQueue.poll();
                firstQueue.add(number);
                secondQueueSum -= number;
                firstQueueSum += number;
                count++;
            }

            if(firstQueueSum == secondQueueSum){
                return count;
            }
        }

    }
}