package programmers.step1;

// https://programmers.co.kr/learn/courses/30/lessons/67256
// 2020 카카오 인턴십 > 키패드 누르기
// https://www.youtube.com/watch?v=jFv2LRVCK6s 참고
public class Programmers_67256 {
    public static void main(String[] args) {
        String answer = "";
        answer = solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
        System.out.println(answer);
    }

    static Position left;  // 왼손 위치
    static Position right; // 오른손 위치
    static Position numPos; // 숫자의 위치

    static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        left = new Position(3, 0);   // 왼손 위치 초기화
        right = new Position(3, 2);  // 오른손 위치 초기화

        for (int num : numbers) {
            numPos = new Position((num - 1) / 3, (num - 1) % 3);    // 숫자의 위치
            if (num == 0) { // 숫자가 0일때
                numPos = new Position(3, 1);
            }
                // 어느손으로 눌렀는지 값 받기
                String finger = numPos.getFinger(hand);

                answer.append(finger);
                if (finger.equals("L")) {
                    left = numPos;
                }else{
                    right = numPos;
                }
        }

        return answer.toString();
    }

    static class Position {
        int row;
        int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public String getFinger(String hand){
            String finger = hand.equals("right")?"R":"L";

            if(this.col == 0){  // 0번째 col의 번호 1,4,7
                finger = "L";
            }else if(this.col == 2){    // 2번째 col의 번호 3,6,9
                finger = "R";
            }else{
                int leftDist = left.getDistance(this);
                int rightDist = right.getDistance(this);

                if(leftDist < rightDist){
                    finger = "L";
                }else if(rightDist < leftDist){
                    finger = "R";
                }
            }

            return finger;
        }

        // 거리구하기
        public int getDistance(Position p){
            return Math.abs(this.row - p.row) + Math.abs(this.col - p.col);
        }
    }
}
