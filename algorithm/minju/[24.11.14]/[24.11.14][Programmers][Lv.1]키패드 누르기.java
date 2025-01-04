class Solution {
    public String solution(int[] numbers, String hand) {
        
        int [][] keypad ={
            {3,1}, //0
            {0,0}, //1
            {0,1},
            {0,2},
            {1,0},
            {1,1},
            {1,2},
            {2,0},
            {2,1},
            {2,2} //9
        };
        
        //포지션 초기화
        int[] lefthand = {3,0}; //*
        int[] righthand= {3,2}; //#
        
        StringBuilder answer = new StringBuilder();
        
        //for 순회
        for(int num : numbers){
            //왼손이 먼저 나가는 숫자들
            if (num == 1 || num == 4 || num == 7){
                answer.append("L");
                lefthand = keypad[num];
            }
            //오른손이 먼저 나가는 숫자들
            else if (num == 3 || num == 6 || num == 9){
                answer.append("R");
                righthand=keypad[num];
            } 
            //가운데열 숫자들
            else {
                int leftDist = Math.abs(lefthand[0] - keypad[num][0]) + Math.abs(lefthand[1]-keypad[num][1]);
                int rightDist = Math.abs(righthand[0] - keypad[num][0]) + Math.abs(righthand[1]-keypad[num][1]);
                
                if(leftDist<rightDist){
                    answer.append("L");
                    lefthand=keypad[num];
                }else if (leftDist>rightDist){
                    answer.append("R");
                    righthand = keypad[num];
                }else{
                    if(hand.equals("right")){
                        answer.append("R");
                        righthand = keypad[num];
                    }else{
                        answer.append("L");
                        lefthand = keypad[num];
                    }
                }
                
            }
        }
        
        return answer.toString();
    }
}