import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        //Integer.toBinaryString(n) - 스트링 타입으로 반환
        //1비트 개수 반환 메소드 Integer.bitCount(n);
        //for문 -> n보다 큰 수 중에 1000000까지 확인
        
        //1-1. 하나씩 구현하기
        //1. n 2진수 변환, 1개수 세기
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i<binary.length(); i++){
            if(binary.charAt(i)=='1') count++;
        }
        
        //1-2. n+1부터 1000000까지 반복해서 판별하기
        for(int i = n+1; i<1000000 ; i++){
            String bin = Integer.toBinaryString(i);
            int cnt = 0;
            for(int j = 0; j < bin.length(); j++){
                if(bin.charAt(j)=='1') cnt++;
            }
            
            //n 이진수 1 개수랑 다음 큰 숫자의 이진수 1의 갯수 비교
            if(count == cnt){
                answer = i;
                break;
            }
        }
        
        
        // //2. Integer.bitCount 써보기
        
        // //2-1. 각각 Integer.bitCount로 카운트 세기 n-> count, n+1 -> cnt
        
        // int count = Integer.bitCount(n);
        
        // while(true){
        //     n++;
        //     int cnt = Integer.bitCount(n);
            
        //     if(count == cnt) break;
        // }
        
        // answer=n;
        
        
        return answer;
    }
}