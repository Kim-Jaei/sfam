//1.Priority Queue

import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        //큰수부터 우선순위로 두는 PriorityQueue
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int s : score){
            pq.offer(s);
        }
        
        int answer = 0;
        
        while(pq.size()>=m){
            //최소값 비교해야하니깐, 일단 엄청 큰 수로 설정하기
            int min = Integer.MAX_VALUE;
            //박스에 m개 사과 담기
            for(int i =0; i<m; i++){
                //pq에서 값 꺼낼때마다 최소값이랑 비교하기
                min = Math.min(min, pq.poll());
            }
            //여러 상자가 있을 수 있으니깐, +=로 계산
            answer += min*m;
        }
        
        return answer;
    }
}


//2. Arrays.sort

import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        //Array.sort 사용하기 - 내림차순 배열!
        Arrays.sort(score);
        
        int answer = 0;
        int l = score.length;
        
        //높은 수부터 m개씩 상자에 넣기
        for (int i = l - m; i >= 0; i -= m) {
            // 묶음의 가장 작은 값은 i번째 사과 점수
            answer += score[i] * m;
        }
        
        return answer;
    }
}
