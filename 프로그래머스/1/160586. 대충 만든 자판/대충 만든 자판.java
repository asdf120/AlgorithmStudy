class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i = 0; i<targets.length; i++){
            String[] targetArr = targets[i].split("");

            int[] targetCount = new int[targetArr.length];

            for(int j = 0; j<targetArr.length; j++){
                int number = -1;

                for(int k = 0; k<keymap.length; k++){
                    String[] keyArr = keymap[k].split("");

                    for(int l = 0; l<keyArr.length; l++){
                        if(targetArr[j].equals(keyArr[l])){
                            if(targetCount[j] == 0){
                                targetCount[j] = l+1;
                            }else{
                                targetCount[j] = Math.min(targetCount[j], l+1);
                            }
                        }
                    }
                }
            }

            for(int count: targetCount){
                if(count == 0){
                    answer[i] = -1;
                    break;
                }
                answer[i] += count;
            }

        }

        return answer;
    }
}