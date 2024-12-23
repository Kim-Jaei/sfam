import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수 이름과 현재 등수를 저장하는 해시맵
        Map<String, Integer> playerToRank = new HashMap<>();
        // 등수와 선수 이름을 저장하는 해시맵
        Map<Integer, String> rankToPlayer = new HashMap<>();
        
        // 초기 순위와 선수 정보를 해시맵에 저장
        for (int i = 0; i < players.length; i++) {
            playerToRank.put(players[i], i);
            rankToPlayer.put(i, players[i]);
        }
        
        // 호출된 선수들의 순위 변경 처리
        for (String caller : callings) {
            // 현재 호출된 선수의 등수
            int currentRank = playerToRank.get(caller);
            // 앞 선수의 이름
            String frontPlayer = rankToPlayer.get(currentRank - 1);
            
            // 순위 교체
            playerToRank.put(caller, currentRank - 1);
            playerToRank.put(frontPlayer, currentRank);
            rankToPlayer.put(currentRank - 1, caller);
            rankToPlayer.put(currentRank, frontPlayer);
        }
        
        // 최종 순위대로 배열에 담기
        String[] answer = new String[players.length];
        for (int i = 0; i < players.length; i++) {
            answer[i] = rankToPlayer.get(i);
        }
        
        return answer;
    }
}
