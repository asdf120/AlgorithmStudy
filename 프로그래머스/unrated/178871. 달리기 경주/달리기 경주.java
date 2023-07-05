import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();
        for(int i = 0; i<players.length; i++){
            playerMap.put(players[i], i);
        }

        for(String callingName: callings){
            int callingPlayerRank = playerMap.get(callingName);
            String frontPlayer = players[callingPlayerRank-1];

            players[callingPlayerRank-1] = callingName;
            players[callingPlayerRank] = frontPlayer;

            playerMap.put(callingName, callingPlayerRank-1);
            playerMap.put(frontPlayer, callingPlayerRank);
        }

        return players;
    }
}