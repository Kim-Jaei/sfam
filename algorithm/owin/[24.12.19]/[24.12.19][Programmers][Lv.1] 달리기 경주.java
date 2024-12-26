/*
    1. callings 배열을 하나씩 체크해서 players에 일치하는 친구와 그 앞 친구를 바꿔준다.
    2. callings의 길이만큼 반복하여 리턴
    ===========================================================================
    callings의 길이가 1,000,000까지라서 이중for문으로는 시간복잡도를 만족하지 못함
*/

// import java.util.*;

// class Solution {
//     public String[] solution(String[] players, String[] callings) {
//         for(int i = 0; i < callings.length; i++) {
//             for(int j = 0; j <players.length; j++) {
//                 if(callings[i].equals(players[j])) {
//                     String player = players[j-1];
//                     players[j-1] = players[j];
//                     players[j] = player;
//                 }    
//             }
//         }
//         return players;
//     }
// }

// =========================================================================

/*
    1. 있는지 비교를 하기 쉬운 형태 + 순서를 교환하기 쉬운 형태 List
    2. players를 ArrayList로 만들고 callings를 하나씩 꺼내 비교
    3. 같은 인덱스에 있는 값을 그 전 인덱스와 교체작업
    4. 작업 후 players를 출력
    ===========================================================================
    이것도 시간초과나서 틀림
*/
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(String player : players) {
            list.add(player);
        }
        
        for(int i = 0; i < callings.length; i++) {
            int num = 0;
            String back = "";
            num = list.indexOf(callings[i]);
            back = list.get(num-1);
            list.set(num-1, callings[i]);
            list.set(num, back);
        }
        answer = list.toArray(new String[0]);
        return answer;
    }
}