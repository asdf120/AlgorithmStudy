package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * https://www.acmicpc.net/problem/1065
 * 한수
 */
public class B_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int answer = solution(count);
        System.out.println(answer);
    }

    static int solution(int num) {
        int answer = 0;

        if (num < 100) {
            return num;
        }
        answer = 99;


        for (int i = num; i >= 100; i--) {
            Set<Integer> set = new HashSet<>();
            String n = String.valueOf(i);

            for (int j = 0; j < n.length(); j++) {
                if (j == n.length() - 1) {
                    break;
                }
                int interval = n.charAt(j) - n.charAt(j + 1);
                set.add(interval);
            }
            if (set.size() == 1) {
                answer++;
            }
        }


        return answer;
    }
}
