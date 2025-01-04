import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> rank = new HashMap<>();
        //map에 현재 등수랑 사람 이름 넣어주기
        for(int i = 0; i<players.length; i++){
            rank.put(players[i], i);
        }
        
        for(String calling : callings){
            //호명된 선수의 등수 찾기
            int nowRank = rank.get(calling);
            
            //등수 교환
            if(nowRank>0){
                int changedPosition = nowRank -1;
                String changedPlayer = players[changedPosition];
                
                //선수배열에서 위치 바꾸기
                players[changedPosition] = calling;
                players[nowRank] = changedPlayer;
                
                //map에서 갱신
                rank.put(calling, changedPosition);
                rank.put(changedPlayer, nowRank);
            }
        }
        
        return players;
    }
}