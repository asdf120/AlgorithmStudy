package study.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 이것이 코딩테스트다 - p.110
 * 구현
 */
public class 상하좌우 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String[] answerArray = new String[count];

        for (int i = 0; i < count; i++) {
            answerArray[i] = br.readLine();
        }
        solution(answerArray);
    }

    static void solution(String[] directions) {
        int x = 1;
        int y = 1;

        for (String d: directions){
            System.out.println(d);
        }

        int[] directionX = {0, 0, -1, 1};
        int[] directionY = {-1, 1, 0, 0};
        String[] direction = {"L", "R", "U", "D"};

        for(int i = 0; i<directions.length; i++){
            for(int j = 0; j<direction.length; j++){
                if(directions[i].equals(direction[j])){
                    x += directionX[j];
                    y += directionY[j];
                    System.out.println(" x : " + x + " y : " + y);
                }
                if (x == 0) {
                    x = 1;
                }
                if (y == 0) {
                    y = 1;
                }
            }
        }
        System.out.println(x + " " + y);
    }
}
