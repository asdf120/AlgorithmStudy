package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12921
// 연습문제 > 소수찾기
public class Programmers_12921 {
    public static void main(String[] args) {
        int answer = 0;
//        answer = solution(10);
        answer = solution(5);
        System.out.println(answer);
    }

    static int solution(int n){
        int answer = 0;
        boolean flag = true;

        for(int i = 2; i<=n; i++){
            // 제곱근의 값이 나누어지면 소수가 아님
            for(int j = 2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }
            flag = true;
        }


        return answer;
    }
}
