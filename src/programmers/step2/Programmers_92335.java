package programmers.step2;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/92335
 * 2022 KAKAO BLIND RECRUITMENT > k진수에서 소수 개수 구하기
 * 참고 https://www.youtube.com/watch?v=ZQIfac0fr9A
 * TODO
 */
public class Programmers_92335 {
    public static void main(String[] args) {
        Programmers_92335 programmers = new Programmers_92335();
        programmers.otherSolution(437674, 3);
        programmers.otherSolution(110011, 10);
    }

    public int solution(int n, int k) {
        int answer = -1;
        return answer;
    }

    public int otherSolution(int n, int k) {
        int answer = 0;

        String convertNumber = k == 10 ? String.valueOf(n) : convert(n, k);
        String[] nums = convertNumber.split("0+");
        for (String num : nums) {
            if (check(Long.parseLong(num))) {
                answer++;
            }
        }
        System.out.println(answer);

        return answer;
    }

    boolean check(long num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }

        for (long i = 2; i <= (long) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 해당 진수로 반환
    String convert(int num, int base) {
        int q = num / base;
        int r = num % base;
        if (q != 0) {
            return convert(q, base) + String.valueOf(r);
        }
        return String.valueOf(r);
    }
}
