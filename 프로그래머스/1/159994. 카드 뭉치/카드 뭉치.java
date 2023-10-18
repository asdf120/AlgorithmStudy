class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {int c1 = 0;
        int c2 = 0;
        for(String g: goal){

            if(c1 < cards1.length){
                if(cards1[c1].equals(g)){
                    c1++;
                    continue;
                }
            }
            if(c2 < cards2.length){
                if(cards2[c2].equals(g)){
                    c2++;
                    continue;
                }
            }

            return "No";
        }

        return "Yes";
    }
}