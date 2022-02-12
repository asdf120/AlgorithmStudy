package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/42862#
// 탐욕법(Greedy) 체육복
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_42862 {

    public static void main(String[] args) {
        int result =  solution(5,new Integer[]{2, 4}, new Integer[]{1, 3, 5});
        System.out.println(result);
    }

    public static int solution(int n, Integer[] lost, Integer[] reserve) {
        int answer = n - lost.length; // 최소값

        List<Integer> lostList = new ArrayList<>();
        for(int l : lost){
            lostList.add(l);
        }
        List<Integer> reserveList = new ArrayList<>();
        for(int r : reserve){
            reserveList.add(r);
        }

        Collections.sort(lostList);
        Collections.sort(reserveList);

        for(int r=0; r<reserveList.size(); r++){
            for(int l=0; l<lostList.size(); l++){
                if(reserveList.get(r) == lostList.get(l)){
                    lostList.remove(l);
                    reserveList.remove(r);
                    r = -1;
                    answer++;
                    break;
                }
            }
        }


        for(int r= 0; r<reserveList.size(); r++){
            for(int l = 0; l<lostList.size(); l++){
                if(reserveList.get(r)-1 == lostList.get(l)){
                    lostList.remove(l);
                    answer++;
                    break;
                }else if(reserveList.get(r)+1 == lostList.get(l)){
                    lostList.remove(l);
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
