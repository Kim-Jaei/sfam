import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        //선물 주고 받은 기록 저장
        int[][] record = new int[friends.length][friends.length];
        
        // 개인별 준 선물, 받은 선물, 선물지수, 다음달 받을 선물 수 저장
        int[][] result = new int[friends.length][4];
        
        //친구들 이름이랑 인덱스 저장할 map
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i =0 ; i<friends.length; i++){
            map.put(friends[i],i);
        }
        
        //선물 준 사람과 받은 사람을 record에 넣기
        for(int i = 0; i<gifts.length; i++){
            String[] temp = gifts[i].split(" ");
            String giver = temp[0];
            String receiver = temp[1];
            record[map.get(giver)][map.get(receiver)]++;
        }
        
        //개인별 result 계산 
        //준 선물, 받은 선물 계산하고 선물지수까지 계산하기
        for(int i = 0; i<friends.length; i++){
            //준거 받은거 전부 초기화
            int given =0; 
            int received=0;
            for(int j =0; j < friends.length; j++){
                given += record[i][j];
                received += record[j][i];
            }
            result[i][0]=given;
            result[i][1]=received;
            result[i][2]=given - received;
        }
        
        // 가운데를 기준 위쪽만 비교
        for( int i = 0 ; i < friends.length ; i ++ ){
            for ( int j = i+1 ; j < friends.length; j++ ){
                // i가 준 선물 수 와 j 가 준 선물 수가 같은 경우
                if( record[i][j] == record[j][i] ){
                    // 선물 지수가 i가 큰 경우
                    if( result[i][2] > result[j][2] ) result[i][3]++;
                    // 선물 지수가 j가 큰 경우
                    if( result[i][2] < result[j][2] ) result[j][3]++;
                    // 선물 지수가 같은 경우
                    if( result[i][2] == result[j][2] ) continue;
                }
                // i가 준 선물이 더 많을 경우
                else if ( record[i][j] > record[j][i] ) result[i][3]++;
                    // j가 준 선물이 더 많은 경우
                else if ( record[i][j] < record[j][i] ) result[j][3]++;
            }
        }

        
        
        //가장 많이 받을 선물 수 계산하기
        
        for(int i =0 ; i <friends.length; i++){
            answer = Math.max(answer, result[i][3]);
        }
        
        
        return answer;
    }
}