import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // 이름과 점수를 매핑하는 Map 생성
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        // photo 순회
        for (int i = 0; i < photo.length; i++) {
            for (String person : photo[i]) {
                answer[i] += map.getOrDefault(person, 0); // 이름이 없으면 점수 0
            }
        }

        return answer;
    }
}
