package programmers.step1;

// https://programmers.co.kr/learn/courses/30/lessons/12977?language=java
// Summer/Winter Coding(~2018) > 소수만들기
public class ProGrammers_12977 {

    public static void main(String[] args) {
//        int answer = solution(new int[]{1, 2, 3, 4});
        int answer = solution(new int[]{1, 2, 7, 6, 4});
        System.out.println(answer);
    }

    static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 2) {
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    for (int l = 2; l < sum; l++) {
                        if (sum % l == 0) {
                            break;
                        } else if (l == (sum-1) && sum % (sum - 1) != 0) {
                            answer++;
                        }
                    }

                }
            }
        }

        return answer;
    }
}
