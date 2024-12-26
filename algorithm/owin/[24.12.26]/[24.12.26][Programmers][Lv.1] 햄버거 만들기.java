/*
    1. 빵 = 1 야채 = 2  고기 = 3 빵
    2. 순서 결국 리스트 ,1231 이 있나 확인, 있으면 그부분을 제거하고 다시 1231이 있나 확인
*/

import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for(int i : ingredient) {
            list.add(i);

            // 크기가 4 이상이면서 1231인 경우
            if (list.size() >= 4 &&
                    list.get(list.size() - 4) == 1 &&
                    list.get(list.size() - 3) == 2 &&
                    list.get(list.size() - 2) == 3 &&
                    list.get(list.size() - 1) == 1) {

                // 햄버거면 그 부분 제거하고 개수 추가
                list.remove(list.size() - 1); // 1
                list.remove(list.size() - 1); // 3
                list.remove(list.size() - 1); // 2
                list.remove(list.size() - 1); // 1

                answer++;
            }
        }

        return answer;
    }
}