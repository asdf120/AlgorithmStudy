package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1712
 * 손익분기점
 */
public class B_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        System.out.println(solution(a,b,c));

    }

    static long solution(long a, long b, long c){
        long answer = 0;

        long cost = a;
        long income = 0;

        boolean flag = true;

        if(b >= c){
            return -1;
        }

        while(flag){
            cost += b;
            income += c;
            answer++;
            if(income > cost){
                flag = false;
            }
        }

        return answer;
    }
}
