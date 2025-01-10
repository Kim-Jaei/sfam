class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum =0;

        //0~9까지 합은 45 -> numbers의 합을 더해서 빼면 된다~

        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }

        answer=45-sum;


        return answer;
    }
}