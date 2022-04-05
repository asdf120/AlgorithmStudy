package programmers.step2;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12949#
 * 연습문제 > 행렬의 곱셈
 */
public class Programmers_12949 {
    public static void main(String[] args) {
//        System.out.println(solution(new int[][]{{1,4},{3,2},{4,1}}, new int[][]{{3,3},{3,3}}));
        System.out.println(solution(new int[][]{{2,3,2},{4,2,4},{3,1,4}}, new int[][]{{5,4},{2,4},{3,1}}));
    }

    static int[][] solution(int[][] arr1, int[][] arr2){
        int[][] answer = new int[arr1.length][arr2.length];

        for(int i = 0; i< arr1.length; i++){
            for(int j = 0; j<arr2[0].length; j++){
                int sum = 0;
                for(int k = 0; k<arr2.length; k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }

        return answer;
    }
}
