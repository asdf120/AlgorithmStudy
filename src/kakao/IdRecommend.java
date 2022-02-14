package kakao;

// 2021 KAKAO BLIND RECRUITMENT
// 신규 아이디 추천
public class IdRecommend {

    public static void main(String[] args) {
        solution("aaa");
    }

    static String solution(String new_id) {
        StringBuilder answer = new StringBuilder();

        boolean lastDot = false;    // 마지막 문자 마침표 확인

        for(char ch: new_id.toCharArray()){
            if(!isValid(ch)){
                continue;
            }
            if(ch == '.'){
                if (answer.length() == 0 || lastDot) {
                    continue;
                }
                lastDot = true;
            }else{
                lastDot = false;
            }
            ch = Character.toLowerCase(ch);
            answer.append(ch);
        }

        if (answer.length() >= 16) {
            answer.setLength(15);
        }

        if (answer.length() == 0) {
            answer.append('a');
        }

        if(answer.charAt(answer.length() - 1) == '.'){
            answer.deleteCharAt(answer.length() - 1);
        }

        if(answer.length() <= 2){
            char ch = answer.charAt(answer.length() -1);
            while(answer.length() < 3){
                answer.append(ch);
            }
        }

        return answer.toString();
    }

    // 문자 타입 유효성 체크
    static boolean isValid(char c){
        if(Character.isLetterOrDigit(c)){
            return true;
        }
        if(c == '-' || c =='_' || c =='.'){
            return true;
        }else{
            return false;
        }
    }
}
