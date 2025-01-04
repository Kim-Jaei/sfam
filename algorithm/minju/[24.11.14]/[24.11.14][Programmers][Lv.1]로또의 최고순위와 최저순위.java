class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        //lottos와 win_nums에 같은 숫자가 있는지 확인하고 + 개수 세기 -> 최저 등수
        //그리고 lottos에 있는 0의 개수를 더해서 최고 등수 도출
        
        //0의 개수 초기화
        int zero = 0;
        //맞는 숫자 초기화
        int match = 0;
        
        //for 루프 통해 lottos의 각 숫자를 판별한다!
        for(int num : lottos){
            //만약 0이라면 zero를 카운트업하기!
            if(num==0){
                zero++;
            } 
            //0이 아니라면 num과 당첨번호를 비교하기
            else{
                for(int win_num : win_nums){
                    if(num==win_num){
                        match++;
                        break;
                    }
                }
            }
        }
        
        int max = rank(match+zero);
        int min = rank(match);
        
        return new int[]{max, min};
    }
    
    //switch - case문으로 각 케이스별 등수 연결하기
    private int rank(int match){
        switch(match){
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2 : return 5;
            default : return 6;
                
        }
    }
}