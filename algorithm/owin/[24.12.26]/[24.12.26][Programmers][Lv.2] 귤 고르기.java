/*
    1. k개를 상자 하나에 담음(크기가 일정하지 않음)
    2. 크기별로 분류 했을 때 서로 다른 종류의 수를 최소화
    3. 종류니까 map 활용 map.key가 같으면 ++ 시켜주기
    4. 이제 같은 종류가 많은 순서대로 k개를 담으면 됨
    5. 담고 나서 중복제거하고 count하면 끝!
*/
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < tangerine.length; i++) {
            if (map.containsKey(tangerine[i])) {
                // 이미 키가 존재하면 값을 1 증가
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            } else {
                // 키가 없으면 값을 1로 설정
                map.put(tangerine[i], 1);
            }
        }
        // System.out.println(map);

        // 개수 기준 내림차순 정렬
        List<Integer> countList = new ArrayList<>(map.values());
        countList.sort(Collections.reverseOrder());
        // System.out.println("중복된 개수 순으로 정렬: " + countList);

        int total = 0, answer = 0;
        for (int count : countList) {
            total += count; // total에 값을 누적시키기
            answer++;       // 종류를 1씩 올리기
            if (total >= k) break;  // tatal이 k 이상 되면 멈추기
        }

        return answer;
    }
}