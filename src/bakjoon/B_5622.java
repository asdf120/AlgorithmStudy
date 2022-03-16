package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/5622
 * 다이얼
 */
public class B_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(solution(word));
    }

    static int solution(String word) {
        int answer = 0;

        char[][] words = new char[][]{{}, {}, {}, {'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'},
                {'M', 'N', 'O'}, {'P', 'Q', 'R', 'S'}, {'T', 'U', 'V'}, {'W', 'X', 'Y', 'Z'}};

        char[] wordArr = word.toCharArray();

        for (int i = 0; i < wordArr.length; i++) {
            Break:
            for (int j = 3; j < words.length; j++) {
                for (int k = 0; k < words[j].length; k++) {
                    if (wordArr[i] == words[j][k]) {
                        answer += j;
                        break Break;
                    }
                }
            }
        }

        return answer;
    }

}
