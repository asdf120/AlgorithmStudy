package study.구현;

/**
 * 이것이 코딩테스트다 p.113
 */
public class 시각 {
    public static void main(String[] args) {
        solution(5);
    }

    static void solution(int n){

        int count = 0;
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<60; j++){
                for(int k = 0; k<60; k++){
                    if(String.valueOf(i + ":" + j + ":" + k).contains("3")){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
