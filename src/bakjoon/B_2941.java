package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2941
 * 크로아티아 알파벳
 */
public class B_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(solution(word));
    }

    static int solution(String word) {
        String[] words = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String w : words){
            if (word.contains(w)) {
                word = word.replace(w, "!");
            }
        }

        return word.length();
    }
}
