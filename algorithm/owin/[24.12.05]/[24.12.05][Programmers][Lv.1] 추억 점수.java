/*
    1. map으로 name과 yearning을 매칭
    2. photo에 차원을 나누고, 나눈 차원에서 비교하고 그리움점수 더해서 배열에 넣기
*/
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // 우선 name과 yearning을 매칭시킬 맵을 만들자!
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < name.length; i++) {
            map.put(name[i],yearning[i]);
        }
        // System.out.println(map);
        // 이제 photo 길이만큼 반복해서 키가 있는지 확인 있으면 값을 더해줌
        for(int i = 0; i < photo.length; i++) {
            int missSum = 0;
            for(int j = 0; j < photo[i].length; j++) {
                if(map.containsKey(photo[i][j]))
                    missSum += map.get(photo[i][j]);
            }
            answer[i] = missSum;
        }
        return answer;
    }
}

/*
    * map 다시 정리
        put - 키, 값 형태로 map에 넣을때 사용
        get - 키 형태로 값을 얻을때 사용
        containsKey - 변수 형태로 해당 변수가 키에 있는지 확인하는 용도
        size - map의 개수를 리턴
*/