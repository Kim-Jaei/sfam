class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum =0;

        //공비수열인가 이거..?
        //price*count 총합을 구하기 위한 for문
        for(int i=1; i<=count; i++){
            sum+=price*i;
        }

        System.out.print(sum);

        if(sum-money>=0){
            answer=sum-money;
        }else {
            answer=0;
        }


        return answer;
    }
}