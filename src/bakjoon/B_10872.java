package bakjoon;

import java.util.Scanner;

/**
 * 팩토리얼
 * https://www.acmicpc.net/problem/10872
 */
public class B_10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int answer = factorial(n);

        System.out.println(answer);
    }

    static int result = 1;

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        result *= n;
        factorial(n - 1);

        return result;
    }
}
