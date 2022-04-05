package programmers.step1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 * 2018 KAKAO BLIND RECRUITMENT > [1차] 다트 게임
 */
public class Programmers_17682 {
    public static void main(String[] args) {
//        solution("1S2D*3T");
//        solution("1S2D*3T");
        solution("1D2S#10S");
//        solution("1D2S0T");
//        solution("1S*2T*3S");
//        solution("1D#2S*3S");
//        solution("1T2D3D#");
    }

    static int solution(String dartResult) {
        int answer = 0;

        System.out.println(dartResult);
        int[] round = new int[3];
        int count = -1;
        int score = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9' ) {
                count++;
                round[count] += Integer.parseInt(String.valueOf(dartResult.charAt(i)));
                if (i != dartResult.length() - 1 && dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0' ) {
                    round[count] = 10;
                    i++;
                }
            }
            System.out.println("count : " + count + " dartResult.charAt(i) : " + dartResult.charAt(i));
            System.out.println("i : " +  i + " score :  " + round[count]);
            switch (dartResult.charAt(i)){
                case 'D':
                    round[count] *= round[count];
                    System.out.println("35line i : " +  i + " score :  " + round[count]);
                    break;
                case 'T':
                    round[count] *= round[count] * round[count];
                    System.out.println("38line i : " +  i + " score :  " + round[count]);
                    break;
                case '*':
                    if(count > 0){
                        round[count-1] *= 2;
                    }
                    round[count] *= 2;
                    System.out.println("41line i : " +  i + " score :  " + round[count]);
                    break;
                case '#':
                    round[count] *= -1;
                    break;
            }
        }
        System.out.println(round[0]+round[1]+round[2]);

        return answer;
    }
}
