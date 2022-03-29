package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1655
 * 가운데를 말해요
 */
public class B_1655 {
    static PriorityQueue<Integer> firstQueue = new PriorityQueue<>(Comparator.reverseOrder());
    static PriorityQueue<Integer> secondQueue = new PriorityQueue<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(solution(Integer.parseInt(br.readLine()))).append("\n");
        }
        System.out.println(sb);
    }

    static int solution(int num) {
        if (firstQueue.size() <= secondQueue.size()) {
            firstQueue.offer(num);
        }else{
            secondQueue.offer(num);
        }

        if (!secondQueue.isEmpty() && firstQueue.peek() > secondQueue.peek()) {
            firstQueue.offer(secondQueue.poll());
            secondQueue.offer(firstQueue.poll());
        }

        return firstQueue.peek();
    }
}
