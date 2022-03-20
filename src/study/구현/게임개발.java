package study.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 이것이 코딩테스트다 p.118
 */
public class 게임개발 {
    static int direction = 0;

    public static void main(String[] args) throws IOException {
        int[] x = {-1, 0, 1, 0};
        int[] y = {0, 1, 0, -1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] mapSize = br.readLine().split(" ");
        int n = Integer.parseInt(mapSize[0]);
        int m = Integer.parseInt(mapSize[1]);
        int[][] map = new int[n][m];

        // 방문여부
        boolean[][] visited = new boolean[n][m];
        int[][] presentLocation = new int[n][m];

        // 사용자 위치
        String[] location = br.readLine().split(" ");
        int locationX = Integer.parseInt(location[0]);
        int locationY = Integer.parseInt(location[1]);
        direction = Integer.parseInt(location[2]);

        visited[locationX][locationY] = true;
        presentLocation[locationX][locationY] = 1;

        // 지도에 지형 설정 ( 0 : 육지, 1: 바다)
        for (int i = 0; i < n; i++) {
            String[] geoArr = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                String geo = geoArr[j];
                map[i][j] = Integer.parseInt(geo);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        int moveX = 0;
        int moveY = 0;

        int rotateCount = 0;
        int count = 1;
        while (true) {
            direction = turnDirection(direction);

            moveX = locationX + x[direction];
            moveY = locationY + y[direction];

            if (map[moveX][moveY] == 0 && !visited[moveX][moveY]) {
                visited[moveX][moveY] = true;
                locationX = moveX;
                locationY = moveY;

                count++;
                rotateCount = 0;
                continue;
            } else {
                rotateCount++;
            }
            if (rotateCount >= 4) {
                moveX = locationX - x[direction];
                moveY = locationY - x[direction];
                if (map[moveX][moveY] == 0) {
                    locationX = moveX;
                    locationY = moveY;
                    rotateCount = 0;
                } else {
                    break;
                }
            }
        }

        System.out.println(count);

    }

    // 방향 설정
    static int turnDirection(int direction) {
        direction -= 1;
        if (direction < 0) {
            direction = 3;
        }
        return direction;
    }
}
