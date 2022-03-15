package programmers.step2;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/77485
 * 2021 Dev-Matching: 웹 백엔드 개발자(상반기) > 행렬 테두리 회전하기
 */
public class Programmers_77485 {
    public static void main(String[] args) {
        int[] answer = {};
        answer = solution(6,6, new int[][]{{2,2,5,4},{3,3,6,6},{5,1,6,3}});
//        answer = solution(6,6, new int[][]{{2,2,5,4}});
    }

    static int[][] matrix = {};

    static int[] solution(int rows, int columns, int[][] queries){
        int[] answer = new int[queries.length];
        matrix = new int[rows][columns];

        int num = 1;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix[i][j] = num;
                num++;
            }
        }

        for(int i = 0; i< queries.length; i++){
            answer[i] = rotate(queries[i]);
        }

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        return answer;
    }

    static int rotate(int[] query){

        int firstX = query[0]-1;
        int firstY = query[1]-1;
        int lastX = query[2]-1;
        int lastY = query[3]-1;

        int first = matrix[firstX][firstY]; // 시작지점 값
        int minNum = first; // 최소 숫자
        int next = matrix[firstX][lastY];   // 회전 하기전의 끝 값
        int last = matrix[firstX+1][firstY];    // 시작지점 전의 값

        int temp;
        for(int i = firstY; i<=lastY-1; i++){
            temp = matrix[firstX][i+1];
            matrix[firstX][i+1] = first;
            first = temp;
            minNum = Math.min(minNum, first);
            System.out.print((i+1) + " : " + matrix[firstX][i+1] + " ");
        }
        System.out.println();
        System.out.println("next : " + next);

        for(int i = firstX; i<=lastX-1; i++){
            temp = matrix[i+1][lastY];
            matrix[i+1][lastY] = next;
            next = temp;
            minNum = Math.min(minNum, next);
            System.out.print(i + " : " + matrix[i][lastY] + " ");
        }
        System.out.println();
        System.out.println("next : " + next);

        for(int i = lastY; i>firstY; i--){
            temp = matrix[lastX][i-1];
            matrix[lastX][i-1] = next;
            next = temp;
            minNum = Math.min(minNum, next);
            System.out.print(i + " : " + matrix[lastX][i] + " ");
        }

        System.out.println();
        System.out.println("next : " + next);

        for(int i = lastX; i>firstX; i--){
            temp = matrix[i-1][firstY];
            matrix[i-1][firstY] = next;
            next = temp;
            minNum = Math.min(minNum, next);
            System.out.print(i + " : " + matrix[i][firstY] + " ");
        }
        System.out.println();
        System.out.println("next : " + next);

        matrix[firstX][firstY] = last;
        System.out.println(minNum);
        return minNum;
    }
}
