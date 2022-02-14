package search;

// 경우의 수, 가장 큰 두 수의 합(완전 탐색)
public class NumberCase {
    public static void main(String[] args) {
        System.out.println(solution(0, 0, 0));
    }

    static int solution(int index, int count, int value) {
        int[] numArray = {1, 2, 3, 4};
        int number = 4;

        if (count == 2) {
            return value;
        }
        if(index == number){
            return  -1;
        }
        int result = 0;
        System.out.println("20line count : " + count);
        System.out.println("=========================");
        result = Math.max(result, solution(index + 1, count + 1, value + numArray[index]));
        System.out.println("=========================");
        System.out.println("21line index : " + index);
        System.out.println("21line count : " + count);
        System.out.println("21line value : " + value);
        System.out.println("21line result : " + result);
        result = Math.max(result, solution(index + 1, count, value));
        System.out.println("=========================");
        System.out.println("23line index : " + index);
        System.out.println("23line count : " + count);
        System.out.println("23line value : " + value);
        System.out.println("23line result : " + result);

        return result;
    }
}
