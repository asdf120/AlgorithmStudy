package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/87389
// 월간 코드 챌린지 시즌3 > 나머지가 1이 되는 수 찾기
public class Programmers_87389 {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution(10);
        System.out.println(answer);
    }

    static int solution(int n){
        int answer = 0;

        for(int i = 2; i<n; i++){
            if(n % i == 1){
                return i;
            }
        }

        return answer;
    }
}
