package programmers;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/12935
// 연습문제 > 제일 작은 수 제거하기
public class Programmers_12935 {

    public static void main(String[] args) {
        int[] answer = {};
        for(int num : answer){
            System.out.print(num + " ");
        }
    }

    static List<Integer> solution(int[] arr){
        List<Integer> list = new ArrayList<>();

        if(arr.length == 1){
            list.add(-1);
            return list;
        }

        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(temp > arr[i]){
                temp = arr[i];
            }
        }
        System.out.println(temp);
        for(int i = 0; i<arr.length; i++){
            if(temp == arr[i]){
                continue;
            }
            list.add(arr[i]);
        }

        return list;
    }
}
