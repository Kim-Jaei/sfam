/*
    1. 명전 배열은 k 길이만큼 설정하고 그 안에 score의 k 길이만큼 배정한다
    2. 그 이후 들어오는 숫자는 명전 배열의 최솟값과 비교하여 그 숫자보다 크다면 교환한다.
    3. 명전 배열의 최솟값을 계속 answer 배열에 저장한다. 
    
    k가 score의 길이보다 크면 0점이 들어와버림
*/
import java.util.*;

class Solution {    
    public int[] solution(int k, int[] score) {        
        int[] answer = new int[score.length];
        int[] myung = new int[k];
        
        for(int i = 0; i < k && i < score.length; i++) {
            myung[i] = score[i];
            Arrays.sort(myung, 0, i + 1);
            answer[i] = myung[0];
        }
        
        for(int i = k; i < score.length; i++) {
            if(score[i] > myung[0]) {
                myung[0] = score[i];
                Arrays.sort(myung);
            }
            answer[i] = myung[0];
        }
        
        return answer;
    }
}