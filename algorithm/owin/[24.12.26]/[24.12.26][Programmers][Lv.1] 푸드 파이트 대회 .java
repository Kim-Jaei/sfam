/*
    1. food[0]은 물이고 그 이후부턴 2로 나눈 나머지 만큼 양쪽에 배치
    2. 왼쪽하고 오른쪽하고 조건을 달리해서 따로 담기
    3. 왼쪽이랑 0, 오른쪽 합치기
*/

class Solution {
    public String solution(int[] food) {
        String answer = "";
        String l = "";
        String r = "";
        for (int i = 1; i < food.length; i++) { // 물 빼고
            int nof = food[i] / 2; // 음식의 수 저장

            for (int j = 0; j < nof; j++) {
                l += i;  // 왼쪽에 배치
                r = i + r;  // i를 r 앞에 둬서 오른쪽에 배치
            }
        }

        answer = l + "0" + r; // 합치기

        return answer;
    }
}