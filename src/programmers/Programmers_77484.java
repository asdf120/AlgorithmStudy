package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/77484
// 2021 Dev-Matching: 웹 백엔드 개발 > 로또의 최고 순위와 최저 순위
public class Programmers_77484 {

    public static void main(String[] args) {
        int[] answer = {};
        answer = solution(new int[]{44,1,0,0,31,25}, new int[]{31,10,45,1,6,19});
//        answer = solution(new int[]{44,1,0,0,31,25}, new int[]{31,10,45,1,6,19});

        for(int num : answer){
            System.out.print(num);
        }
    }

    static int[] solution(int[] lottos, int[] win_nums){
        int[] answer = new int[2];

        int zeroCount = 0;
        for(int num : lottos){
            if(num == 0){
                zeroCount++;
            }
        }

        int matchCount = 0;
        for(int i = 0; i<lottos.length; i++){
            for(int j = 0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    matchCount++;
                }
            }
        }
        // 1 == 6, 2 == 5, 3 == 4, 4 == 3, 5 == 2 6 == 1
        int positiveRank = 7 - (matchCount + zeroCount);
        if(positiveRank == 7){
            positiveRank = 6;
        }
        int negativeRank = 7 - matchCount;
        if(negativeRank == 7){
            negativeRank = 6;
        }
        answer[0] = positiveRank;
        answer[1] = negativeRank;

        return answer;
    }
}
