class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        // 루프로 s 문자열 하나씩 가져오기
        for( int i =0 ; i<s.length(); i++){
            char a = s.charAt(i);
            //이동수 추적
            int cnt = 1;
            
            //while로 cnt가 index에 도달할때까지 문자 이동
            while(cnt <= index){
		            //한칸씩 이동
                a++;
                
                //z 넘어가면 a부터 시작
                if(a>'z'){
                    a -=26;
                }
                //만약 이동 문자가 skip에 포함 -> continue로 다음 루프로 넘어감
                if(skip.contains(a+""))
                    continue;
                    //문자열에 포함 안되는 경우만 cnt 증가 -> 이동횟수로 간주
                else {
                    cnt++;
                }
                
            }
            //이동 완료된 문자를 answer에 추가
            answer += a;
        }
        
        return answer;
    }
}