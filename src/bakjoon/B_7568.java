package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 브루트 포스 -> 덩치
 * https://www.acmicpc.net/problem/7568
 */
public class B_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = Integer.parseInt(st.nextToken());

        String[][] array = new String[count][2];

        for(int i = 0; i<count; i++){
            st = new StringTokenizer(br.readLine(), " ");
            array[i][0] = st.nextToken();
            array[i][1] = st.nextToken();
        }

        String answer = solution(array);
        System.out.println(answer);
    }

    static String solution(String[][] array){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<array.length; i++){
            int count = 1;
            int weight = Integer.parseInt(array[i][0]);
            int height = Integer.parseInt(array[i][1]);
            if (i == array.length - 1) {
                for(int x = i-1; x>=0; x--){
                    int weight3 = Integer.parseInt(array[x][0]);
                    int height3 = Integer.parseInt(array[x][1]);
                    if(weight < weight3 && height < height3){
                        count++;
                    }
                }
                sb.append(count);
                break;
            }
            for(int j = i+1; j<array.length; j++){
                int weight2 = Integer.parseInt(array[j][0]);
                int height2 = Integer.parseInt(array[j][1]);
                if(weight < weight2 && height < height2){
                    count++;
                }
            }
            for(int x = i-1; x>=0; x--){
                int weight3 = Integer.parseInt(array[x][0]);
                int height3 = Integer.parseInt(array[x][1]);
                if(weight < weight3 && height < height3){
                    count++;
                }
            }
            sb.append(count + " ");
        }

        return sb.toString();
    }
}
