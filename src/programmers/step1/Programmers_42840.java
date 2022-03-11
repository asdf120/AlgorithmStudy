package programmers.step1;

// https://programmers.co.kr/learn/courses/30/lessons/42840
// 완전탐색 > 모의고사
public class Programmers_42840 {
    public static void main(String[] args) {
        int[] answer = {};
//        answer = solution(new int[]{1,2,3,4,5});
        answer = solution(new int[]{1,3,2,4,2,1,3,2,4,2,1,3,2,4,2});
//        answer = solution(new int[]{3, 2, 4, 2, 4});
        for (int num : answer) {
            System.out.print(num);
        }
    }

    static int[] solution(int[] answers) {
        int[] answer = {};
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int firstScore = 0;
        int secondScore = 0;
        int thirdScore = 0;

        for (int i = 0; i < answers.length; i++) {
            int j = i;
            int f = i;
            int s = i;
            int t = i;

            if (i >= answers.length) {
                j = i % answers.length;
            }
            if(i>=first.length){
                f = i % first.length;
            }
            if(i>=second.length){
                s = i %second.length;
            }
            if(t>=third.length){
                t = i%third.length;
            }

            if (answers[j] == first[f]) {
                firstScore++;
            }
            if(answers[j] == second[s]){
                secondScore++;
            }
            if(answers[j] == third[t]){
                thirdScore++;
            }
        }

        if (firstScore == secondScore && firstScore == thirdScore) {
            answer = new int[]{1, 2, 3};
        } else if (firstScore > secondScore && firstScore > thirdScore) {
            answer = new int[]{1};
        } else if (firstScore == secondScore && secondScore > thirdScore) {
            answer = new int[]{1, 2};
        } else if (firstScore == thirdScore && firstScore > secondScore) {
            answer = new int[]{1, 3};
        } else if (secondScore > firstScore && secondScore > thirdScore) {
            answer = new int[]{2};
        } else if (secondScore == thirdScore && secondScore > firstScore) {
            answer = new int[]{2, 3};
        } else if (thirdScore > firstScore && thirdScore > secondScore) {
            answer = new int[]{3};
        }

        return answer;
    }
}
