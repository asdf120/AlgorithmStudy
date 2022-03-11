package programmers.step1;

// https://programmers.co.kr/learn/courses/30/lessons/86491
// 위클리 챌린지 > 최소직사각형
public class Programmers_86491 {
    public static void main(String[] args) {
        int answer = 0;
//        answer = solution(new int[][]{{60,50},{70,30},{60,30},{80,40}});
//        answer = solution(new int[][]{{10,7},{12,3},{15,8},{14,7},{15,5}});
        answer = solution(new int[][]{{14,4},{19,6},{6,16},{18,7},{7,11}});
        answer = solution2(new int[][]{{14,4},{19,6},{6,16},{18,7},{7,11}});

        System.out.println(answer);
    }

    static int solution(int[][] sizes){
        int answer = 0;
        int width = 0;
        int height = 0;

        for(int i = 0; i< sizes.length; i++){
            int temp = 0;
            width = sizes[i][0];
            height = sizes[i][1];
            if(height > width){
                temp = width;
                width = height;
                height = temp;
            }
            sizes[i][0] = width;
            sizes[i][1] = height;

        }

        for(int i = 0; i<sizes.length; i++){
            int tempWidth = sizes[i][0];
            if(tempWidth > width){
                width = tempWidth;
            }
            int tempHeight = sizes[i][1];
            if(tempHeight > height){
                height = tempHeight;
            }
        }
        answer = width * height;

        return answer;
    }

    // 시간이 더 오래걸림
    static int solution2(int[][] sizes){
        int answer = 0;
        int width = 0;
        int height = 0;

        for(int[] size : sizes){
            int tempWidth = Math.max(size[0], size[1]);
            int tempHeight = Math.min(size[0], size[1]);

            System.out.println(tempWidth + " " + tempHeight);
            if(tempWidth > width){
                width = tempWidth;
            }
            if(tempHeight > height){
                height = tempHeight;
            }
        }
        answer = width * height;

        return answer;
    }
}
