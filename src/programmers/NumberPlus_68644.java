package programmers;

import java.util.*;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

// https://programmers.co.kr/learn/courses/30/lessons/68644
// 두 개 뽑아서 더하기
public class NumberPlus_68644 {

    public static void main(String[] args) {
        int[] answers = solution(new int[]{2, 1, 3, 4, 1});
        for(int i : answers){
            System.out.println(i);
        }
    }


    public static int[] solution(int[] numbers) {
        Set set = new HashSet();

        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
            if(i == numbers.length-2){
                break;
            }
        }

        int[] answer = new int[set.size()];

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
