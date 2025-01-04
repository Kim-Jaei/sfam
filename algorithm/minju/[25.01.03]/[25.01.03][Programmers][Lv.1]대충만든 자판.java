import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        
        //map에 각 글자별 클릭수를 저장하기
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                if(map.getOrDefault(keymap[i].charAt(j), 101) > j+1){
                    map.put(keymap[i].charAt(j), j+1);
                }
            }
        }
        
        //map 사용해서 숫자 카운트하기
        for(int i = 0 ; i < targets.length; i++){
            int count = 0;
            for( int j = 0; j <targets[i].length(); j++){
                if(map.containsKey(targets[i].charAt(j)) == false){
                    count = -1;
                    break;
                }else{
                    count += map.get(targets[i].charAt(j));
                }
            }
            answer[i] = count;
        }
        
        
        
        
        return answer;
    }
}