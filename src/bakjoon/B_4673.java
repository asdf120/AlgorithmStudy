package bakjoon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// https://www.acmicpc.net/problem/4673
// 셀프 넘버
public class B_4673 {
    public static void main(String[] args) {
        List<Integer> list = solution();
        for(int num : list){
            System.out.println(num);
        }
    }

    static List<Integer> solution() {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i = 1; i<= 10000; i++){
            answerList.add(i);
            int num = i;
            answer += num;
            while (num > 0) {
                answer += num % 10;
                num = num / 10;
            }
            list.add(answer);
            answer = 0;
        }

        Iterator<Integer> iterator = answerList.iterator();
        while(iterator.hasNext()){
            int n = iterator.next();
            for(int i = 0; i<list.size(); i++){
                if(list.get(i) == n){
                    iterator.remove();
                    break;
                }
            }
        }

        return answerList;
    }

}
