package programmers.step1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/77884
 * 월간 코드 챌린지 시즌2 > 약수의 개수와 덧셈
 */
public class Programmers_77884 {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution(13,17);
        System.out.println(answer);
    }
    static int solution(int left, int right){
        int answer = 0;

        for(int i = left; i<=right; i++){
            int count = 0;
            for(int j = 1; j<=i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count % 2 == 0){
                answer += i;
            }else{
                answer -= i;
            }
        }

        return answer;
    }
}
