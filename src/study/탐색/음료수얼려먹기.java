package study.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 이것이 코딩테스트다. p.149
 */
public class 음료수얼려먹기 {

    static int n = 0;
    static int m = 0;
    static int[][] map = new int[n][m];

    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] mapSize = br.readLine().split(" ");
        n = Integer.parseInt(mapSize[0]);
        m = Integer.parseInt(mapSize[1]);
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] geoArr = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                String geo = geoArr[j];
                map[i][j] = Integer.parseInt(geo);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(dfs(i,j)){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

    static boolean dfs(int x, int y){
        if(x < 0 || x>=n || y < 0 || y>=m){
            return false;
        }else if(map[x][y] == 0){
            System.out.println("x : " + x + " y : " + y);
            map[x][y] = 1;
            dfs(x-1, y);
            dfs(x+1, y);
            dfs(x, y-1);
            dfs(x, y+1);
            return true;
        }
        return false;
    }

}
