package programmers.step2;

/**
 * TODO
 * https://programmers.co.kr/learn/courses/30/lessons/62048
 * Summer/Winter Coding(2019) > 멀쩡한 사각형
 */
public class Programmers_62048 {
    public static void main(String[] args) {
        long answer = 1;
        answer = solution(8,12);
        answer = solution(4,6);
        System.out.println(answer);
    }

    static long solution(long w, long h){
        long answer = w*h;

        //최대공약수
        long bigNum = bigNum(w, h);
        answer -= w + h - bigNum;

        return answer;
    }

    static long bigNum(long w, long h){
        long num = 1;
        for(long i = 1; i<=Math.min(w,h); i++){
            if(w % i == 0 && h % i == 0){
                num = i;
            }
        }
        return num;
    }
}
