package programmers.step1;

// https://programmers.co.kr/learn/courses/30/lessons/12922
// 연습문제 > 수박수박수박수박수박수?

public class Programmers_12922 {
    public static void main(String[] args) {
        String answer = "";
        answer = solution(3);
        System.out.println(answer);
    }

    static String solution(int n){
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<=n/2; i++){
            sb.append("수박");
        }
        if(n%2==1){
            sb.append("수");
        }

        return sb.toString();
    }
}
