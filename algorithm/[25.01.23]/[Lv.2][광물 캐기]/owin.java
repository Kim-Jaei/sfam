import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int useDia = picks[0] * 5;
        int useIron = picks[1] * 5;
        int useStone = picks[2] * 5;

        List<String> list = new ArrayList<>(Arrays.asList(minerals));
        // 다이아 곡괭이 부분
        for(int i = 0; i < useDia; i++) {
            if(list.size() == 0) return answer;
            list.remove(0);
            answer += 1;
        }

        // 철 곡괭이 부분
        for(int i = 0; i < useIron; i++) {
            if(list.size() == 0) return answer;
            if(list.get(0).equals("diamond")) {
                list.remove(0);
                answer += 5;
            } else {
                list.remove(0);
                answer += 1;
            }
        }

        // 돌 곡괭이 부분
        for(int i = 0; i < useStone; i++) {
            if(list.size() == 0) return answer;
            if(list.get(0).equals("diamond")) {
                list.remove(0);
                answer += 25;
            } else if(list.get(0).equals("iron")){
                list.remove(0);
                answer += 5;
            } else {
                list.remove(0);
                answer += 1;
            }
        }
        System.out.print(list);
        return answer;
    }
}

// 최소 피로도를 계산해야하는데 그냥 순서대로 곡괭이를 써버려서 실패