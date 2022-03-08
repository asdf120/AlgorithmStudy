package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/76501
// 월간 코드 챌린지 시즌2 > 음양 더하기
public class Programmers_76501 {
    public static void main(String[] args) {

    }

    static int solution(int[] absolutes, boolean[] signs){
        int answer = 0;

        for(int i = 0; i<absolutes.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}
