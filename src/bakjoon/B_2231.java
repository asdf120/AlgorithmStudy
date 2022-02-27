package bakjoon;

/**
 * 분해합
 * https://www.acmicpc.net/problem/2231
 */
public class B_2231 {
    public static void main(String[] args) {
        int answer = solution("216");
        System.out.println(answer);
    }

    static int solution(String s){
        String tempNum = "";
        int number = Integer.parseInt(s);

        for(int i = 1; i<=number; i++){
            int sum = 0;
            tempNum = String.valueOf(i);
            sum += i;
            for(int j = 0; j<tempNum.length(); j++){
                sum += Character.getNumericValue(tempNum.charAt(j));
            }
            if(sum == number){
                break;
            }else{
                tempNum = "0";
            }
        }

        return Integer.parseInt(tempNum);
    }

}
