class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] list = new int[number];
        
        //1. for문 돌면서 1~n까지 약수를 구해서 새로운 배열에 넣는다!
        for(int i = 1; i<=number; i++){
            //8 - 1,2,4,8
            for(int j=1; j*j<=i; j++ ){
                //약수 조건
                if(i%j==0){
                    //List 카운트업
                    list[i-1]++;
                    //대칭 약수 카운트하기 -> j가 i/j랑 같지 않으면 카운트업
                    if(j != i/j){
                        list[i-1]++;
                    }
                }
            }
            
        }  
    
        //2. 새로운 배열을 for문으로 돌면서 Limit랑 비교하여 넘치면 power를 더하고, 아니면 그냥 그대로 넣기
        for(int i =0; i<list.length; i++){
            if(list[i]>limit){
                answer+=power;
            }else
                answer+=list[i];
        }
        
        return answer;
    }
}