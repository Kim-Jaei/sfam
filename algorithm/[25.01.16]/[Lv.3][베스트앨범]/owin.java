import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<Integer,String[]> map = new HashMap<>();
        for(int i = 0; i < plays.length; i++) {
            String g = genres[i];
            String p = Integer.toString(plays[i]);
            map.put(i, new String[]{g, p});
        }
//        for(int key : map.keySet()) {
//            String[] value = map.get(key);
//            System.out.println(key + " : " + Arrays.toString(value));
//        }
        // map의 값에 [1] 자리를 높은 순서대로 정렬하고 배열에 담다가 [0]자리를 누적시켜서 2 이상이 되면 그 장르는 못쓰게해서 랭킹
        // 쭉 메기고 그 값에 해당하는 키를 순서대로 배열에 담아 리턴

        return answer;
    }
}