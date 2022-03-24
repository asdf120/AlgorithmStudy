package study.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 이것이 코딩테스트다. p.152
 */
public class 미로탈출 {

    static int n = 0;
    static int m = 0;
    static int[][] map = new int[n][m];

    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};

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

        answer = bfs(0,0);
        System.out.println(answer);

    }

    static int bfs(int x, int y) {
        // 큐(Queue) 구현을 위해 queue 라이브러리 사용
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        // 큐가 빌 때까지 반복하기
        while(!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();
            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                // 미로 찾기 공간을 벗어난 경우 무시
                if (nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue;
                }
                // 벽인 경우 무시
                if (map[nx][ny] == 0){
                    continue;
                }
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (map[nx][ny] == 1) {
                    map[nx][ny] = map[x][y] + 1;    // 이전 방문값에 +1을 해줌 --> 거리
                    q.offer(new Node(nx, ny));
                }
            }
        }
        // 가장 오른쪽 아래까지의 최단 거리 반환
        return map[n - 1][m - 1];
    }

    static class Node {

        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }
    }

}
