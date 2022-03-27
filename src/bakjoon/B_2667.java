package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

    /**
     * https://www.acmicpc.net/problem/2667
     * 단지번호붙이기
     */
    public class B_2667 {
        static int[][] houseArr = {};   //지도
        static int count = 0;   //배열 갯수

        static int houseNum = 0;    //단지
        static int houseCount = 0;  //집의 수

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            count = Integer.parseInt(br.readLine());
            houseArr = new int[count][count];

            for (int i = 0; i < count; i++) {
                String[] input = br.readLine().split("");
                for (int j = 0; j < count; j++) {
                    houseArr[i][j] = Integer.parseInt(input[j]);
                }
            }

            Map<Integer, Integer> map = new HashMap<>(); //1

            //2
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if (dfs(i, j)) { //3
                        houseNum++;
                        map.put(houseNum, houseCount);
                    }
                    houseCount = 0; //4
                }
            }

            List<Integer> answerArr = new ArrayList<>();
            for (int n : map.values()) {
                answerArr.add(n);
            }
            //5
            Collections.sort(answerArr);

            System.out.println(houseNum);
            for (int n : answerArr) {
                System.out.println(n);
            }
        }

        static boolean dfs(int x, int y) {
            if (x < 0 || x >= count || y < 0 || y >= count) {
                return false;
            }
            if (houseArr[x][y] == 1) {
                houseCount++;
                houseArr[x][y] = 0;
                dfs(x, y + 1); // 동
                dfs(x, y - 1); // 서
                dfs(x + 1, y); // 남
                dfs(x - 1, y); // 북
                return true;
            }
            return false;
        }

}
