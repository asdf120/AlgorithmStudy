package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1157
 * 단어 공부
 */
public class B_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String answer = solution(word);
        System.out.println(answer);
    }

    static String solution(String word){
        String answer = "?";

        Map<String, List<String>> map = new HashMap<>();
        word = word.toUpperCase();

        for(int i = 0; i<word.length(); i++){
            String s = String.valueOf(word.charAt(i));
            List<String> list = map.getOrDefault(s, null);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(s);
            map.put(s,list);
        }

        int count = 0;
        for(String s : map.keySet()){
            List<String> list = map.get(s);
            if (list.size() > count) {
                answer = s;
                count = list.size();
            }else if(list.size() == count){
                answer = "?";
            }
        }


        return answer;
    }
}
