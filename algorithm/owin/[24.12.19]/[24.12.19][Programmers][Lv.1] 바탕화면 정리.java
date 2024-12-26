/*
    1. 전체 배열을 나눠서 큰 판으로 나태내보기
    2. 각 지점의 값을 조건문으로 #이면 그 자리를 체크하는 무언가가 필요
    3. 체크한 지점들의 값을 비교(왼쪽 위와 오른쪽 아래를 지정할 수 있는 무언가)
    4. 해서 나온 두 좌표를 순서대로 asnwer배열에 입력 후 출력
*/

import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int x = wallpaper[0].length();
        int y = wallpaper.length; // 몇 곱하기 몇인지 파악
        
        int lux = y, luy = x, rdx = -1, rdy = -1;
        
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i);  // 가장 위쪽 행
                    luy = Math.min(luy, j);  // 가장 왼쪽 열
                    rdx = Math.max(rdx, i);  // 가장 아래쪽 행
                    rdy = Math.max(rdy, j);  // 가장 오른쪽 열
                }
            }
        }
        answer[0] = lux;
        answer[1] = luy; 
        answer[2] = rdx+1;
        answer[3] = rdy+1;
        return answer;
    }
}