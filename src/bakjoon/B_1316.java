package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/1316
 * 그룹 단어 체커
 */
public class B_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String[] answerArray = new String[count];

        for (int i = 0; i < count; i++) {
            answerArray[i] = br.readLine();
            solution(answerArray[i]);
        }
        System.out.println(answer);
    }
    static int answer = 0;
    static void solution(String word){

        List<String> list = new ArrayList<>();
        list.add("!");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<word.length(); i++){
            String s = String.valueOf(word.charAt(i));
            if(list.get(i).equals(s)){
                list.add(s);
                sb.append(s);
            }else{
                if(!sb.toString().contains(s)){
                    list.add(s);
                    sb.append(s);
                }else{
                    break;
                }
            }
        }
        if(word.equals(sb.toString())){
            answer++;
        }

    }
}
