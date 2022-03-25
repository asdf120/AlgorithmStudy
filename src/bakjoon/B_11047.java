package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11047
 * 동전 0
 */
public class B_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int amount = Integer.parseInt(st.nextToken());

        int[] coins = new int[count];

        for (int i = 0; i < count; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        coins = new int[]{1,5,10,50,100,500,1000,5000,10000,50000};
        solution(amount, coins);
    }

    static void solution(int amount, int[] coins) {
        int answer = 0;

        int balance = amount;

        for (int i = coins.length - 1; i >= 0; i--) {
            if (balance / coins[i] != 0) {
                System.out.println(coins[i]);
                answer += balance / coins[i];
                balance = balance % coins[i];
            }
        }
        System.out.println(answer);
    }
}
