package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/8958
// OX 퀴즈
public class B_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String[] answerArray = new String[count];

        for (int i = 0; i < count; i++) {
            answerArray[i] = br.readLine();
            System.out.println(solution(answerArray[i]));
        }

    }

    static int solution(String result) {
        int finalScore = 0;
        int score = 0;
        for (int j = 0; j < result.length(); j++) {
            if (result.charAt(j) == 'O') {
                score++;
            } else {
                score = 0;
            }
            finalScore += score;
        }

        return finalScore;
    }
}
