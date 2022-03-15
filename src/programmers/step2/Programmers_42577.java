package programmers.step2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 * 해시 > 전화번호 목록
 */
public class Programmers_42577 {
    public static void main(String[] args) {
        boolean answer = true;
        answer = solution(new String[]{"119", "97674223", "1195524421"});
        answer = solution(new String[]{"123","456","789"});
//        answer = solution(new String[]{"12","123","1235","567","88"});
        System.out.println(answer);
    }

    static boolean solution(String[] phone_book){
        boolean answer = true;

        Arrays.sort(phone_book);

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i< phone_book.length; i++){
            map.put(phone_book[i], i);
        }

        for(int i = 0; i< phone_book.length; i++){
            for(int j = 0; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }

        return answer;
    }

    // 시간초과
    static boolean failSolution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i = 0; i< phone_book.length; i++){
            for(int j = i+1; j< phone_book.length; j++){
                if(phone_book[j].startsWith(phone_book[i])){
                    return false;
                }
            }
        }

        return answer;
    }
}
