package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 브루트 포스 -> 블랙잭
 * https://www.acmicpc.net/problem/2798
 */
public class B_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int cardNum = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());

        int[] cardArray = new int[cardNum];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<cardArray.length; i++){
            cardArray[i] = Integer.parseInt(st.nextToken());
        }

        int answer = solution(cardNum, sum, cardArray);
        System.out.println(answer);
    }

    static int solution(int cardNum, int sum, int[] cardArray){
        int answer = 0;
        for(int i = 0; i<cardArray.length; i++){
            int temp = 0;
            if(i == cardArray.length-2){
                break;
            }
            for(int j = i+1; j<cardArray.length; j++){
                if(j == cardArray.length-1){
                    break;
                }
                for(int x = j+1; x<cardArray.length; x++){
                    temp = (cardArray[i] + cardArray[j] + cardArray[x]);
                    if (temp == sum) {
                        answer = temp;
                        i = cardArray.length-2;
                        j = cardArray.length-1;
                        break;
                    }
                    if(temp > sum){
                        continue;
                    }
                    if(sum-temp < sum-answer){
                        answer = temp;
                    }
                }
            }
        }
        return answer;
    }
}
