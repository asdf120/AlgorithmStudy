package programmers.step2;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 * 깊이/너비 우선 탐색(DFS/BFS) > 타겟 넘버
 * 참고 https://hyojun.tistory.com/entry/Programmers-%ED%83%80%EA%B2%9F-%EB%84%98%EB%B2%84-Java?category=980310
 */
public class Programmers_43165 {
    public static void main(String[] args) {
        Programmers_43165 programmers = new Programmers_43165();
//        int answer = programmers.solution(new int[]{1, 1, 1, 1, 1}, 3);
        int answer = programmers.solution(new int[]{4,1,2,1}, 4);
        System.out.println(answer);
    }

    static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, -numbers[0], target, 0);
        dfs(numbers, numbers[0], target, 0);
        return answer;
    }

    public void dfs(int[] numbers, int number, int target, int length) {
        if (length == numbers.length - 1 && number == target) {
            answer++;
            return;
        }
        if (length == numbers.length - 1) {
            return;
        }
        dfs(numbers, number + numbers[length + 1], target, length + 1);
        dfs(numbers, number - numbers[length + 1], target, length + 1);
    }
}
