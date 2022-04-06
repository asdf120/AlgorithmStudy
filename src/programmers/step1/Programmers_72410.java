package programmers.step1;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/72410
 * 2021 KAKAO BLIND RECRUITMENT > 신규 아이디 추천
 */
public class Programmers_72410 {
    public static void main(String[] args) {
        solution("...!@BaT#*..y.abcdefghijklm");
//        solution("z-+.^.");
//        solution("=.=");
    }

    static String solution(String new_id) {
        // 1.대문자 -> 소문자 치환
        new_id = new_id.toLowerCase();
        StringBuilder sb = new StringBuilder();
        // 2.알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        for (char ch : new_id.toCharArray()) {
            String s = String.valueOf(checkCh(ch)).replace(" ", "");
            sb.append(s);
        }

        // 3.마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        new_id = sb.toString();
        stop: while (true) {
            if (new_id.length() == 1) {
                break;
            }
            for (int i = 0; i < new_id.length(); i++) {
                if (i == new_id.length() - 1) {
                    break stop;
                }
                if (new_id.charAt(i) == '.' && new_id.charAt(i + 1) == '.' ) {
                    new_id = new_id.replace("..", ".");
                    break;
                }
                if(i == new_id.length() -1){
                    if (new_id.charAt(i) != '.' || new_id.charAt(i + 1) != '.' ) {
                        break stop;
                    }
                }
            }
        }

        // 4.new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (new_id.charAt(0) == '.' ) {
            sb = new StringBuilder();
            for (int i = 1; i < new_id.length(); i++) {
                sb.append(new_id.charAt(i));
            }
            new_id = sb.toString();
        }
        if (new_id.length() != 0) {
            if (new_id.charAt(new_id.length() - 1) == '.' ) {
                sb = new StringBuilder();
                for (int i = 0; i < new_id.length() - 1; i++) {
                    System.out.println(new_id.charAt(i)+ " ");
                    sb.append(new_id.charAt(i));
                }
            }
        }
        new_id = sb.toString();

        // 5.new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (new_id.length() == 0) {
            new_id = "a";
        }

        // 6.new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if (new_id.charAt(new_id.length() - 1) == '.' ) {
                sb = new StringBuilder();
                for (int i = 0; i < new_id.length() - 1; i++) {
                    sb.append(new_id.charAt(i));
                }
            } else {
                sb = new StringBuilder();
                for (int i = 0; i < new_id.length(); i++) {
                    sb.append(new_id.charAt(i));
                }
            }
            new_id = sb.toString();
        }

        // 7.new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if (new_id.length() <= 2) {
            while (sb.length() != 3) {
                sb.append(new_id.charAt(new_id.length() - 1));
            }
        }

        return sb.toString();
    }

    static char checkCh(char ch) {
        if (ch >= 'a' && ch <= 'z' ) {
            return ch;
        }
        if (ch >= '0' && ch <= '9' ) {
            return ch;
        }
        if (ch == '-' ) {
            return ch;
        }
        if (ch == '_' ) {
            return ch;
        }
        if (ch == '.' ) {
            return ch;
        }

        return ' ';
    }
}
