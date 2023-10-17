import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int height = wallpaper.length;
        int width = wallpaper[0].split("").length;

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                if(wallpaper[i].split("")[j].equals("#")){
                    xList.add(i);
                    yList.add(j);
                }
            }
        }

        Collections.sort(xList);
        Collections.sort(yList);

        int minX = xList.get(0);
        int minY = yList.get(0);
        int maxX = xList.get(xList.size()-1)+1;
        int maxY = yList.get(yList.size()-1)+1;


        
        return new int[]{minX, minY, maxX, maxY};
    }
}