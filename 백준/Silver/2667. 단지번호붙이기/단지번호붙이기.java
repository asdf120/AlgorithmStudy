import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
        public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        count = Integer.parseInt(br.readLine());
        houseArr = new int[count][count];

        for(int i=0; i<count; i++) {
            String[] input = br.readLine().split("");
            for(int j=0; j<count; j++) {
                houseArr[i][j] = Integer.parseInt(input[j]);
            }
        }
        solution(count);
    }

    static int[][] houseArr = {};
    static int count = 0;

    static int houseNum = 0;
    static int houseCount = 0;

    static void solution(int num) {
        count = num;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (dfs(i, j)) {
                    houseNum++;
                    map.put(houseNum, houseCount);
                }
                houseCount = 0;
            }
        }

        List<Integer> answerArr = new ArrayList<>();
        for (int n : map.values()){
            answerArr.add(n);
        }
        Collections.sort(answerArr);

        System.out.println(houseNum);
        for(int n : answerArr){
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