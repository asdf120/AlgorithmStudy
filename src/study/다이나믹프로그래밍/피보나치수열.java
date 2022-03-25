package study.다이나믹프로그래밍;

/**
 * 이것이 코딩테스트다. p.212
 * 메모이제이션 기법
 */
public class 피보나치수열 {
    static long[] arr = new long[100];
    public static void main(String[] args) {

        System.out.println(fibonacci(10));
    }

    static long fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        
        // 이미 계산한적 있는 값이라면 바로 리턴
        if(arr[n] != 0){
            return arr[n];
        }
        return arr[n] = fibonacci(n-1) + fibonacci(n-2);
    }
}
