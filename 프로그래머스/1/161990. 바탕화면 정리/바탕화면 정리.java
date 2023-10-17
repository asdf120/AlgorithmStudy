import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {51,51,-1,-1};
        int height = wallpaper.length;
        int width = wallpaper[0].split("").length;

        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                if(wallpaper[i].split("")[j].equals("#")){
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i);
                    answer[3] = Math.max(answer[3], j);
                }
            }
        }
        answer[2] += 1;
        answer[3] += 1;

        return answer;
    }
}