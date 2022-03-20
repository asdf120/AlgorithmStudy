package study;

/**
 * 이것이 코딩테스트다 p.115
 */
public class 왕실의나이트 {
    public static void main(String[] args) {
        solution("a1");
        solution("c2");
    }

    static void solution(String location) {

        int[][] steps = {{-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {-2, -1}, {-2, 1}, {2, -1}, {2, 1}};
        int row = location.charAt(1)-48;
        int col = location.charAt(0)-96;
        int count = 0;

        for(int i = 0; i<steps.length; i++){
            int moveRow = (row+steps[i][0]);
            int moveCol = (col+steps[i][1]);
            if(moveRow < 1 || moveRow > 8 || moveCol < 1 || moveCol > 8){
                continue;
            }
            count++;
        }

        System.out.println(count);
    }
}
