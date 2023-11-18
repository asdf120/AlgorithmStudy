class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        answer = Integer.parseInt(reverse,3);
        
        return answer;
    }
}