package programmers.step1;

// https://programmers.co.kr/learn/courses/30/lessons/12947
// 연습문제 > 하샤드 수
public class Programmers_12947 {
    public static void main(String[] args) {
        boolean answer = true;
        answer = solution(11);
        System.out.println(answer);
    }

    static boolean solution(int x){
        boolean answer = true;

        int temp = x;
        int sum = 0;
        while(temp != 0){
            sum += temp % 10;

            temp = temp / 10;
        }
        if(x % sum != 0){
            answer = false;
        }

        return answer;
    }
}
