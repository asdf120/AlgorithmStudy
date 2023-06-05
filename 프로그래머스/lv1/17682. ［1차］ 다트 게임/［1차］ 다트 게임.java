class Solution {
    public int solution(String dartResult) {
        int[] round = new int[3];

        int count = 0;
        for (int i = 0; i < dartResult.length(); i++) {

            if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9'){
                int score = Integer.parseInt(String.valueOf(dartResult.charAt(i)));

                if(dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0'){
                    score = 10;
                    i++;
                }

                i++;
                switch (dartResult.charAt(i)){
                    case 'S':
                        score *= 1;
                        break;
                    case 'D':
                        score *= score;
                        break;
                    case 'T':
                        score *= score * score;
                        break;
                }

                round[count] = score;

                if(i+1 != dartResult.length()){
                    switch (dartResult.charAt(i+1)){
                        case '*':
                            if (count != 0) {
                                round[count - 1] = round[count - 1] * 2;
                            }
                            round[count] = score * 2;
                            i++;
                            break;
                        case '#':
                            round[count] = -score;
                            i++;
                            break;
                    }
                }

                count++;
            }
        }

        return round[0]+round[1]+round[2];
    }
}