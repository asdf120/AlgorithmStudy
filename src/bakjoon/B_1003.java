package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1003
 * 피보나치 함수
 */
public class B_1003 {
    static int zeroCount = 0;
    static int oneCount = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<count; i++){
            fibonacci(Integer.parseInt(br.readLine()));
            sb.append(zeroCount).append(" ").append(oneCount).append("\n");
            zeroCount = 0;
            oneCount = 0;
        }
        System.out.println(sb.toString());
    }

    static void fibonacci(int n){
        int zero = 0;
        int one = 1;
        int zeroToOne = 0;

        if (n == 0) {
            zeroCount++;
        } else if (n == 1) {
            oneCount++;
        } else{
            for(int i = 1; i<n; i++){
                zeroToOne = zero + one;
                zero = one;
                one = zeroToOne;
            }
            zeroCount += zero;
            oneCount += one;
        }

    }
}
