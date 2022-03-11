package programmers.step1;

import java.util.Arrays;

public class Programmers_42748 {
    public static void main(String[] args) {
        int[] answer = {};
//        answer = solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3}});
        answer = solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}});
        for(int num : answer){
            System.out.println(num);
        }
    }

    static int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        for(int i = 0; i< commands.length; i++){
            int first =  commands[i][0] -1;
            int second = commands[i][1] -1;
            int third = commands[i][2]- 1;
            int length = second - first + 1;

            int[] tempArray = new int[length];
            for(int j = 0; j<length; j++){
                tempArray[j] = array[first+j];
            }
            Arrays.sort(tempArray);
            answer[i] = tempArray[third];
        }

        return answer;
    }
}
