package programmers.step2;

import java.util.HashSet;
import java.util.Set;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/49994
 * Summer/Winter Coding(~2018) > 방문 길이
 */
public class Programmers_49994 {
    public static void main(String[] args) {
        int answer = 0;
//        answer = solution("LULLLLLLU");
        answer = solution("LRLRL");
        System.out.println(answer);
    }

    static int solution(String dirs){
        int answer = 0;
        boolean[][][][] visited = new boolean[11][11][11][11];

        int[] xDirection = {0, -1, 0, 1};
        int[] yDirection = {-1, 0, 1, 0};
        String[] directions = {"U","L","D","R"};


        int xLocation = 5;
        int yLocation = 5;

        for(int i = 0; i<dirs.length(); i++){
            String d = String.valueOf(dirs.charAt(i));
            for(int j = 0; j< directions.length; j++){
                if(directions[j].equals(d)){
                    int x = xLocation;
                    int y = yLocation;
                    xLocation += xDirection[j];
                    yLocation += yDirection[j];
                    if(xLocation < 0 || xLocation > 10 || yLocation < 0 || yLocation > 10 ){
                        xLocation -= xDirection[j];
                        yLocation -= yDirection[j];
                        break;
                    }else if(visited[x][xLocation][y][yLocation] || visited[xLocation][x][yLocation][y]){
                        break;
                    }
                    visited[x][xLocation][y][yLocation] = true;
                    visited[xLocation][x][yLocation][y] = true;
                    answer++;
                    break;
                }
            }
        }


        return answer;
    }
}
