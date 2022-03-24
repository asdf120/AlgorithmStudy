package programmers.step2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 * 정렬 > 가장 큰 수
 * TODO compareTo
 */
public class Programmers_42746 {
    public static void main(String[] args) {
        String answer = "";
        answer = solution(new int[]{3, 30, 34, 5, 9});
//        answer = solution(new int[]{6,10,2});
        System.out.println(answer);
    }

    static String solution(int[] numbers){
        String[] numberString = new String[numbers.length];

        for(int i = 0 ; i<numberString.length;i++){
            numberString[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numberString,new Comparator<String>(){
            public int compare(String s1,String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });

        if(numberString[0].equals("0")){
            return "0";
        }

        return String.join("", numberString);
    }
}
