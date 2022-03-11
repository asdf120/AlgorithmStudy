package programmers.step2;

// https://programmers.co.kr/learn/courses/30/lessons/42842
// 완전탐색 > 카펫
public class Programmers_42842 {

    public static void main(String[] args) {
        int[] answer = {};
        answer = solution(10,2);
    }

    static int[] solution(int brown, int yellow){
        int[] answer = {};

        int sumCount = brown + yellow;
        // i를 가로로
        for(int i = 2; i<=sumCount/2; i++){
            if (sumCount % i == 0) {
                // 세로
                int oppositNum = sumCount / i;
                if(i < oppositNum || oppositNum <3){
                    continue;
                }
                if((i-2)*(oppositNum-2) == yellow){
                    return new int[]{i,oppositNum};
                }
            }
        }

        return answer;
    }
}
