package bakjoon;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int answer = fibonacci(n);

        System.out.println(answer);
    }

    static int first = 0;
    static int second = 1;
    static int result = 0;
    static int fibonacci(int n){
        if(n == 0){
            return result;
        }else if (n == 1){
            return 1;
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