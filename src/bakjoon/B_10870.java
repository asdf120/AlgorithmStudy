package bakjoon;

/**
 * 피보나치 수 5
 * https://www.acmicpc.net/problem/10870
 */
public class B_10870 {
    public static void main(String[] args) {
        int answer = fibonacci(10);
        System.out.println(answer);
    }

    static int first = 0;
    static int second = 1;
    static int result = 0;
    static int fibonacci(int n){
        if(n == 1){
            return result;
        }
        result = first + second;
        first = second;
        second = result;

        fibonacci(n-1);

        return result;
    }

    static int fibonacci2(int n){
        if(n == 0){
            return result;
        }else if (n == 1){
            return 1;
        }

        return fibonacci2(n-1) + fibonacci2(n-2);
    }
}
