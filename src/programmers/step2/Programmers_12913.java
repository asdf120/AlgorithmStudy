package programmers.step2;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12913
 * 연습문제 > 땅따먹기
 */
public class Programmers_12913 {
    public static void main(String[] args) {
        int answer = 0;
        answer = solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}});
        System.out.println(answer);
    }

    static int solution(int[][] land){
        int answer = 0;

        for(int i=1; i<land.length; i++){
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }

        answer = land[land.length-1][0];
        for(int i = 1; i<4; i++){
            if(answer < land[land.length-1][i]){
                answer = land[land.length-1][i];
            }
        }

        return answer;
    }
}
